package com.prueba.infrastructure.adapter;

import com.prueba.application.dto.PriceDTO;
import com.prueba.application.repository.PriceRepository;
import com.prueba.domain.Price;
import com.prueba.infrastructure.mapper.PriceMapper;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public class PriceRepositoryImpl implements PriceRepository {
    private final PriceCrudRepository priceCrudRepository;
    private final PriceMapper priceMapper;

    public PriceRepositoryImpl(PriceCrudRepository priceCrudRepository, PriceMapper priceMapper) {
        this.priceCrudRepository = priceCrudRepository;
        this.priceMapper = priceMapper;
    }

    @Override
    public Iterable<Price> getAllPrices() {
        return priceMapper.toPrices(priceCrudRepository.findAll());
    }

    @Override
    public List<PriceDTO> findByPriceDTO(LocalDateTime dateApplication, Integer productId, Integer brandId) {

        return priceCrudRepository.findByPriceDTO(dateApplication, productId, brandId);
    }

}
