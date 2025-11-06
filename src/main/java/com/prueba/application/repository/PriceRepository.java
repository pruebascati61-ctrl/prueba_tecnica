package com.prueba.application.repository;

import com.prueba.application.dto.PriceDTO;
import com.prueba.domain.Price;

import java.time.LocalDateTime;
import java.util.List;


public interface PriceRepository {
    Iterable<Price> getAllPrices();

    List<PriceDTO> findByPriceDTO(LocalDateTime dateApplication, Integer productId, Integer brandId);
}
