package com.prueba.infrastructure.adapter;

import com.prueba.infrastructure.entity.PriceEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface PriceCrudRepository extends CrudRepository<PriceEntity, Integer> {
    @Query("SELECT new PriceDTO(u.dateApplication, u.productId, u.brandId) FROM prices u " +
            "WHERE u.endDate >= :dateApplication and u.starDate<=:dateApplication and " +
            "u.productId=:productId and u.brandId=:brandId")
    List<PriceEntity> findByPriceDTO(@Param("dateApplication") LocalDateTime dateApplication,
                                     @Param("productId") String productId,
                                     @Param("brandId") String brandId);
}

