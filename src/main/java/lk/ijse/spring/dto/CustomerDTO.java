package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Isuri Disanayaka
 * @date:08/08/2021
 * @since : 0.0.1
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerDTO {
    private String id;
    private String name;
    private String email;
    private String password;
}
