package com.Project.SpringCrud.Service;

import com.Project.SpringCrud.DTO.CustomerDTO;
import com.Project.SpringCrud.DTO.CustomerSaveDTO;
import com.Project.SpringCrud.DTO.CustomerUpdateDTO;

import java.util.List;

public interface CustomerService {

    String addCustomer(CustomerSaveDTO customerSaveDTO);

    List<CustomerDTO> getCustomerData();

//    String UpdateCustomer(CustomerUpdateDTO customerUpdateDTO);
}
