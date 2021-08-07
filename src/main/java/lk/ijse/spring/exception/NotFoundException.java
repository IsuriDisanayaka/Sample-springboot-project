package lk.ijse.spring.exception;

/**
 * @author : Isuri Disanayaka
 * @date:08/08/2021
 * @since : 0.0.1
 **/
public class NotFoundException extends RuntimeException {
    public NotFoundException(String message){

        super(message);
    }
}
