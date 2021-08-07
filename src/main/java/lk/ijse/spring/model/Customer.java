package lk.ijse.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author : Isuri Disanayaka
 * @date:08/08/2021
 * @since : 0.0.1
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
@Document
public class Customer {
       @Id
        private String id;
        private String name;
        private String email;
        private String password;
}

