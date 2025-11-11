package com.prueba.infrastructure.adapter;

import com.prueba.application.dto.PriceDTO;
import com.prueba.application.repository.PriceRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public class PriceRepositoryImpl implements PriceRepository {
    private final PriceCrudRepository priceCrudRepository;

    public PriceRepositoryImpl(PriceCrudRepository priceCrudRepository) {
        this.priceCrudRepository = priceCrudRepository;
    }

    @Override
    public List<PriceDTO> findByPriceDTO(LocalDateTime dateApplication, Integer productId, Integer brandId) {
        return priceCrudRepository.findByPriceDTO(dateApplication, productId, brandId);
    }

}
