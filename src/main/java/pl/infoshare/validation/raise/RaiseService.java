package pl.infoshare.validation.raise;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.infoshare.validation.raise.model.AcceptedRaise;
import pl.infoshare.validation.raise.model.RaiseRequest;
import pl.infoshare.validation.raise.validators.NotEnoughBudgetException;
import pl.infoshare.validation.raise.validators.RaiseBudgetValidator;

@Component
@RequiredArgsConstructor
public class RaiseService {

    private final RaiseBudgetValidator raiseBudgetValidator;

    public AcceptedRaise analyzeRaiseRequest(RaiseRequest raiseRequest) {
        if (!raiseBudgetValidator.hasEnoughBudget(raiseRequest)) {
            throw new NotEnoughBudgetException();
        }

        return AcceptedRaise.forRequest(raiseRequest);
    }
}
