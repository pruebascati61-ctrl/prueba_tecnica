package com.prueba.application.service;


import com.prueba.application.repository.PriceRepository;
import com.prueba.domain.Price;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PriceService {

    private final PriceRepository priceRepository;


    public PriceService(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;

    }

    public Iterable<Price> getPrices(){
        return  priceRepository.getPrices();
    }


}
