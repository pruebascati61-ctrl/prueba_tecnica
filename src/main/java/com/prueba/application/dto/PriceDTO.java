package com.prueba.application.dto;


import java.math.BigDecimal;
import java.time.LocalDateTime;
public record PriceDTO(String productId, String brandId, String priceList, LocalDateTime dateApplication, BigDecimal price){
}
