package com.Project.SpringCrud.Controller;

import com.Project.SpringCrud.DTO.CustomerDTO;
import com.Project.SpringCrud.Entity.Customer;
import com.Project.SpringCrud.Service.CustomerService;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.ByteArrayOutputStream;

/**
 *
 */
@RestController
@CrossOrigin
@RequestMapping("/api/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    /**
     *
     * @param customerDTO
     * @return
     */
    @PostMapping(path = "/insert")
    public Customer saveCustomer(@RequestBody @Valid CustomerDTO customerDTO) {
        Customer Success = customerService.addCustomer(customerDTO);
        return Success;
    }

    /**
     *
     * @param x
     * @param y
     * @return
     */
    @GetMapping(path = "/select")
    public ResponseEntity<Object> getCustomer(@RequestParam int x, @RequestParam int y) {
        Page<Customer> Data = customerService.getCustomerData(x, y);
        return new ResponseEntity<Object>(Data.getContent(), HttpStatus.OK);
    }

@GetMapping("/generate")
public ResponseEntity<byte[]> generateAndDownloadPdf()throws DocumentException{
        try {

            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

            Document document = new Document();
            PdfWriter.getInstance(document, byteArrayOutputStream);
            document.open();

            for (Customer custom : customerService.getCustomerData(1,1)) {
                document.add(new Paragraph("Book details"));
                document.add(new Paragraph("________________________________"));
                document.add(new Paragraph("Id: " + custom.getCustomerid()));
                document.add(new Paragraph("Name: " + custom.getCustomername()));
                document.add(new Paragraph("Address: " + custom.getCustomeraddress()));
                document.add(new Paragraph("Mobile: " + custom.getMobile()));
                document.add(new Paragraph("--------------------------------"));
            }


            document.close();

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_PDF);
            headers.setContentDispositionFormData("filename", "generated.pdf");
            //headers.add("Custom-Header", "Custom Value");
            return ResponseEntity
                    .ok()
                    .headers(headers)
                    .body(byteArrayOutputStream.toByteArray());
        } catch (ArithmeticException e) {
            e.printStackTrace();

            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to generate PDF.".getBytes());
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }
}
}
