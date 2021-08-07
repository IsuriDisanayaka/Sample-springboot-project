package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.exception.NotFoundException;
import lk.ijse.spring.service.CustomerService;
import lk.ijse.spring.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Isuri Disanayaka
 * @date:08/08/2021
 * @since : 0.0.1
 **/
@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {
    @Autowired
    private CustomerService customerService;


    @PostMapping(path = "/save")
    public ResponseEntity saveCustomer(@RequestBody CustomerDTO dto) {
        if (dto.getId().trim().length() <= 0) {
            throw new NotFoundException("Customer id cannot be empty");
        }
        customerService.addCustomer(dto);
        return new ResponseEntity(new StandardResponse("201", "Done", dto), HttpStatus.CREATED);
    }
}
