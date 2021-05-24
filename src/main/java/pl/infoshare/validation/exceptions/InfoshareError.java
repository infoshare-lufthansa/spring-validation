package pl.infoshare.validation.exceptions;

import lombok.Value;

@Value
public class InfoshareError {
    String errorCode;
    Integer statusCode;
    String explanation;
}
