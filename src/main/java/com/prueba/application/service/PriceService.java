package com.prueba.application.service;


import com.prueba.application.dto.PriceDTO;
import com.prueba.application.repository.PriceRepository;
import com.prueba.domain.Price;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@Service
public class PriceService {

    private final PriceRepository priceRepository;

    public PriceService(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    public Iterable<Price> getAllPrices(){
        return priceRepository.getAllPrices();
    }

    public List<PriceDTO> getPrices(LocalDateTime dateApplication, Integer productId, Integer brandId){
        return priceRepository.findByPriceDTO(dateApplication, productId, brandId);
    }
}
