package com.prueba.infrastructure.adapter.input;


import java.time.LocalDateTime;

public record PriceResponse(LocalDateTime dateApplication, String productId, String brandId) {

}
