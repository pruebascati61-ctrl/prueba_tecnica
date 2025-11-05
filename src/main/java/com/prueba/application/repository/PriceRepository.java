package com.prueba.application.repository;

import com.prueba.domain.Price;

import java.time.LocalDateTime;
import java.util.List;


public interface PriceRepository {
    Iterable<Price> getAllPrices();

    List<Price> findByPriceDTO(LocalDateTime dateApplication, String productId, String brandId);
}
