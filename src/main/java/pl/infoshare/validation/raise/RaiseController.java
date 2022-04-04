package pl.infoshare.validation.raise;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.infoshare.validation.raise.model.AcceptedRaise;
import pl.infoshare.validation.raise.model.RaiseRequest;

import javax.validation.Valid;


@RestController
@RequiredArgsConstructor
public class RaiseController {

    private final RaiseService raiseService;

    @PostMapping("/api/raises")
    public AcceptedRaise analyzeRaiseRequest(@RequestBody @Valid RaiseRequest raiseRequest) {
        return raiseService.analyzeRaiseRequest(raiseRequest);
    }
}
