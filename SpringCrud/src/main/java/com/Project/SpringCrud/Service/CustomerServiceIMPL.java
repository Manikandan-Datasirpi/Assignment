package com.Project.SpringCrud.Service;

import com.Project.SpringCrud.DTO.CustomerDTO;
import com.Project.SpringCrud.DTO.CustomerSaveDTO;
import com.Project.SpringCrud.DTO.CustomerUpdateDTO;
import com.Project.SpringCrud.Entity.Customer;
import com.Project.SpringCrud.Repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceIMPL implements CustomerService{
    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public String addCustomer(CustomerSaveDTO customerSaveDTO) {
        Customer customer= new Customer(
                customerSaveDTO.getName(),
                customerSaveDTO.getAddress(),
                customerSaveDTO.getMobile()
        );
        customerRepo.save(customer);
        return "Inserted Sucessfully..";
    }

    @Override
    public List<CustomerDTO> getCustomerData() {
        List<Customer>customersData= customerRepo.findAll();
        List<CustomerDTO> customerDTOList= new ArrayList<>();
        for (Customer a:customersData) {
            CustomerDTO customerDTO = new CustomerDTO(
              a.getCustomerid(),
              a.getCustomername(),
              a.getCustomeraddress(),
              a.getMobile()
            );
            customerDTOList.add(customerDTO);
        }
        return  customerDTOList;
    }

//    @Override
//    public String UpdateCustomer(CustomerUpdateDTO customerUpdateDTO) {
//        if(customerRepo.existsById(customerUpdateDTO.getCustomerid()))
//        {
//            Customer customer = new Customer();
//        }
//    }
}
