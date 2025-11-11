package com.prueba.application.dto;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PriceDTO(Integer productId,
                       Integer brandId,
                       String priceList,
                       LocalDateTime dateApplication,
                       BigDecimal price) { }
