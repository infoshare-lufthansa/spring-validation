package pl.infoshare.validation.exceptions;

import lombok.Value;

public class InfoshareException extends RuntimeException {

    private final String code;

    public InfoshareException(String message, String code) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
