package com.prueba.application.dto;


import java.time.LocalDateTime;
public record PriceDTO(LocalDateTime dateApplication, Integer productId, Integer brandId) {
}