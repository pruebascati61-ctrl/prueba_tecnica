package com.prueba.infrastructure.adapter;

import com.prueba.application.dto.PriceDTO;
import com.prueba.infrastructure.entity.PriceEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

//public interface PriceCrudRepository extends CrudRepository<PriceEntity, Integer> {
//    @Query("SELECT new PriceDTO(:dateApplication, u.productId, u.brandId) FROM prices u " +
//            "WHERE u.endDate >= :dateApplication and u.starDate<=:dateApplication and " +
//            "u.productId=:productId and u.brandId=:brandId")
//    List<PriceEntity> findByPriceDTO(@Param("dateApplication") LocalDateTime dateApplication,
//                                     @Param("productId") String productId,
//                                     @Param("brandId") String brandId);
//}

public interface PriceCrudRepository extends CrudRepository<PriceEntity, Integer> {

    @Query("SELECT new com.prueba.application.dto.PriceDTO(:dateApplication, u.productId, u.brandId) " +
            "FROM PriceEntity u " +
            "WHERE u.endDate >= :dateApplication AND u.startDate <= :dateApplication AND " +
            "u.productId = :productId AND u.brandId = :brandId")
    List<PriceDTO> findByPriceDTO(@Param("dateApplication") LocalDateTime dateApplication,
                                  @Param("productId") Integer productId,
                                  @Param("brandId") Integer brandId);
}