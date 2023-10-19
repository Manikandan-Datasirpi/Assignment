package com.Project.SpringCrud.Controller;

import com.Project.SpringCrud.DTO.CustomerDTO;
import com.Project.SpringCrud.DTO.CustomerSaveDTO;
import com.Project.SpringCrud.DTO.CustomerUpdateDTO;
import com.Project.SpringCrud.Entity.Customer;
import com.Project.SpringCrud.Repository.CustomerRepo;
import com.Project.SpringCrud.Service.CustomerService;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.* ;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/customer")
public class CustomerController
{ @Autowired
private CustomerService customerService;
@PostMapping(path="/insert")
public  Customer saveCustomer( @RequestBody @Valid  CustomerDTO customerDTO)
{
    Customer Success=customerService.addCustomer(customerDTO);
    return Success;
}
@GetMapping(path="/select")
public ResponseEntity<Object> getCustomer(@RequestParam int x, @RequestParam int y)
{
    Page<Customer> Data=customerService.getCustomerData(x,y);
    return new ResponseEntity<Object>(Data.getContent(), HttpStatus.OK);
}
//public ResponseEntity<Page<Customer>> listEntities(Pageable pageable) {
//    Page<Customer> entities = CustomerRepo.findAll(pageable);
//    return ResponseEntity.ok(entities);
//}
//@PostMapping(path="/Update")
//public String UpdateCustomer()
//{
//    String id=customerService.UpdateCustomer(CustomerUpdateDTO);
//    return id;
//}
}
