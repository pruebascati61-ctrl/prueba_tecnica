package com.prueba.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Price {
    private Integer brandId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String priceList;
    private String productId;
    private Integer priority;
    private BigDecimal price;
    private String curr;
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;

}
