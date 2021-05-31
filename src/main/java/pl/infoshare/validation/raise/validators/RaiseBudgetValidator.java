package pl.infoshare.validation.raise.validators;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.infoshare.validation.raise.RaiseBudgetRepository;
import pl.infoshare.validation.raise.model.RaiseRequest;

@Component
@RequiredArgsConstructor
public class RaiseBudgetValidator {

    private final RaiseBudgetRepository raiseBudgetRepository;

    public boolean hasEnoughBudget(RaiseRequest raiseRequest) {
        var remainingBudget = raiseBudgetRepository.getRemainingBudget();
        var salaryDifference = raiseRequest.getProposedSalary().subtract(raiseRequest.getCurrentSalary());

        return remainingBudget.compareTo(salaryDifference) >= 0;
    }
}
