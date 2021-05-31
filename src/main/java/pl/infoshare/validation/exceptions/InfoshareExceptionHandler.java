package pl.infoshare.validation.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class InfoshareExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(InfoshareException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public InfoshareError handleInfoshareException(InfoshareException exception) {
        return new InfoshareError(exception.getCode(), 400, exception.getMessage());
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        return ResponseEntity
                .badRequest()
                .body(new InfoshareError(ex.getNestedPath(), 400, ex.getMessage()));
    }
}
