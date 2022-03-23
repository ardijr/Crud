package id.ac.uin.student.student.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class StudentNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private String message;

    public StudentNotFoundException(String message) {
        this.message = message;
    }
}
