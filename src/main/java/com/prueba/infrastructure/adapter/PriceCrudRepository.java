package com.prueba.infrastructure.adapter;
//
//import com.prueba.application.dto.PriceDTO;
//import com.prueba.infrastructure.entity.PriceEntity;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.query.Param;
//
//import java.time.LocalDateTime;
//import java.util.List;
//
//
//public interface PriceCrudRepository extends CrudRepository<PriceEntity, Integer> {
//
//    @Query("SELECT new com.prueba.application.dto.ParamDTO(:dateApplication, u.productId, u.brandId) " +
//            "FROM PriceEntity u " +
//            "WHERE u.endDate >= :dateApplication AND u.startDate <= :dateApplication AND " +
//            "u.productId = :productId AND u.brandId = :brandId")
//    List<PriceDTO> findByPriceDTO(@Param("dateApplication") LocalDateTime dateApplication,
//                                  @Param("productId") String productId,
//                                  @Param("brandId") Integer brandId);
//}

import com.prueba.application.dto.PriceDTO;
import com.prueba.infrastructure.entity.PriceEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

    public interface PriceCrudRepository extends CrudRepository<PriceEntity, Integer> {

        @Query(value = "SELECT u.product_id productId, u.brand_id brandId, u.price_list priceList, " +
                ":dateApplication dateApplication, u.price price " +
                "FROM PRICES u " +
                "WHERE u.end_date >= :dateApplication AND u.start_date <= :dateApplication " +
                "AND u.product_id = :productId AND u.brand_id = :brandId",
                nativeQuery = true)
        List<PriceDTO> findByPriceDTO(@Param("dateApplication") LocalDateTime dateApplication,
                                      @Param("productId") Integer productId,
                                      @Param("brandId") Integer brandId);
    }