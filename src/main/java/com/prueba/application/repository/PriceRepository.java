package com.prueba.application.repository;

import com.prueba.application.dto.PriceDTO;
import java.time.LocalDateTime;
import java.util.List;


public interface PriceRepository {
    List<PriceDTO> findByPriceDTO(LocalDateTime dateApplication, Integer productId, Integer brandId);
}
