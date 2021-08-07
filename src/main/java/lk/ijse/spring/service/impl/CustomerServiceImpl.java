package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.exception.ValidateException;
import lk.ijse.spring.model.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

/**
 * @author : Isuri Disanayaka
 * @date:08/08/2021
 * @since : 0.0.1
 **/
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepo customerRepo;
    @Autowired
    private ModelMapper mapper;


    @Override
    public boolean addCustomer(CustomerDTO dto) {

        if (customerRepo.existsById(dto.getId())) {
            throw new ValidateException("Customer Already Exist");
        }
       customerRepo.save(mapper.map(dto, Customer.class));
       return true;
    }

    @Override
    public CustomerDTO searchCustomer(String id) {
        return null;
    }

    @Override
    public boolean deleteCustomer(String id) {
        return false;
    }

    @Override
    public boolean updateCustomer(CustomerDTO dto) {
        return false;
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomer() {
        return null;
    }
}
