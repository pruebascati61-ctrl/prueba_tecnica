package com.prueba.infrastructure.adapter.output;


import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PriceResponse(String productId, String brandId, String priceList, LocalDateTime dateApplication, BigDecimal price) {

}
