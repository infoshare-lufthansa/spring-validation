package pl.infoshare.validation.raise;

import org.springframework.stereotype.Component;
import pl.infoshare.validation.raise.model.AcceptedRaise;
import pl.infoshare.validation.raise.model.RaiseRequest;

@Component
public class RaiseService {

    public AcceptedRaise analyzeRaiseRequest(RaiseRequest raiseRequest) {
        return AcceptedRaise.forRequest(raiseRequest);
    }
}
