package io.corbs.stocks;

import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
public class Quote {
    private String ticker;
    private BigDecimal price;
    private Instant instant;
}
