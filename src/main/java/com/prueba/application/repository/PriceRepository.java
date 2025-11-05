package com.prueba.application.repository;

import com.prueba.domain.Price;


public interface PriceRepository {
    Iterable<Price> getPrices();
    void deletePriceById(Integer id);
}
