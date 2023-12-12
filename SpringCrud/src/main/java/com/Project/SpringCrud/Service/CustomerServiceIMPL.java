package com.Project.SpringCrud.Service;

import com.Project.SpringCrud.DTO.CustomerDTO;
import com.Project.SpringCrud.Entity.Customer;
import com.Project.SpringCrud.Repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceIMPL implements CustomerService{
    @Autowired
    private CustomerRepo customerRepo;

    /**
     *
     * @param customerDTO
     * @return
     */
    @Override
    public Customer addCustomer(CustomerDTO customerDTO) {
        Customer customer= new Customer(
                customerDTO.getCustomername(),
                customerDTO.getCustomeraddress(),
                customerDTO.getMobile()
        );
        customerRepo.save(customer);
        return customer;    }


    /**
     *
     * @param x
     * @param y
     * @return
     */
    @Override
    public Page<Customer> getCustomerData(int x, int y) {
           Page<Customer> cd = customerRepo.findAll(PageRequest.of(x,y));
           return  cd;
    }

//    @Override
//    public String UpdateCustomer(CustomerUpdateDTO customerUpdateDTO) {
//        if(customerRepo.existsById(customerUpdateDTO.getCustomerid()))
//        {
//            Customer customer = new Customer();
//        }
//    }
}
