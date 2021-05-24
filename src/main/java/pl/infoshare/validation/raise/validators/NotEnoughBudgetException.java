package pl.infoshare.validation.raise.validators;

import pl.infoshare.validation.exceptions.InfoshareException;

public class NotEnoughBudgetException extends InfoshareException {

    private static final String ERROR_CODE = "no-budget";
    private static final String ERROR_MESSAGE = "There is not enough budget to cover this raise request.";

    public NotEnoughBudgetException() {
        super(ERROR_MESSAGE, ERROR_CODE);
    }
}
