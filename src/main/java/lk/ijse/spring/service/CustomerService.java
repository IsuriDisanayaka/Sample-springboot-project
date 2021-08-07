package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;

import java.util.ArrayList;


/**
 * @author : Isuri Disanayaka
 * @date:08/08/2021
 * @since : 0.0.1
 **/
public interface CustomerService {
    boolean addCustomer (CustomerDTO dto);
    CustomerDTO searchCustomer(String id);
    boolean deleteCustomer(String id);
    boolean updateCustomer (CustomerDTO dto);
    ArrayList<CustomerDTO>getAllCustomer();
}
