package com.Project.SpringCrud.Service;

import com.Project.SpringCrud.DTO.CustomerDTO;
import com.Project.SpringCrud.DTO.CustomerSaveDTO;
import com.Project.SpringCrud.Entity.Customer;
import org.springframework.data.domain.Page;

public interface CustomerService {



    Customer addCustomer(CustomerDTO customerDTO);

    Page<Customer> getCustomerData(int x, int y);

//    String UpdateCustomer(CustomerUpdateDTO customerUpdateDTO);
}
