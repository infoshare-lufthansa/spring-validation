package pl.infoshare.validation.raise.model;

import lombok.Value;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Value
public class RaiseRequest {
    BigDecimal currentSalary;
    LocalDate proposedRaiseDate;
    BigDecimal proposedSalary;
    List<AcceptedRaise> previousRaises;
}
