package com.prueba.application.dto;


import java.time.LocalDateTime;
public record PriceDTO(LocalDateTime dateApplication, String productId, String brandId) {
}