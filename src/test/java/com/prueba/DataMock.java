package com.prueba;


import com.prueba.application.dto.PriceDTO;
import com.prueba.infrastructure.adapter.output.PriceResponse;
import com.prueba.infrastructure.entity.PriceEntity;

import java.math.BigDecimal;
import java.time.LocalDateTime;


public class DataMock {

    public static final PriceEntity PRICE_ENTITY_1;
    public static final PriceEntity PRICE_ENTITY_2;
    public static final PriceEntity PRICE_ENTITY_3;
    public static final PriceEntity PRICE_ENTITY_4;

    public static final PriceDTO PRICE_1_DTO;
    public static final PriceDTO PRICE_2_DTO;
    public static final PriceDTO PRICE_3_DTO;
    public static final PriceDTO PRICE_4_DTO;
    public static final PriceDTO PRICE_5_DTO;

    public static final PriceResponse PRICE_1_RESPONSE;
    public static final LocalDateTime fecha;
    public static final Integer productId;
    public static final Integer brandId;


    static{
        /*
        Test 1: petición a las 10:00 del día 14 del producto 35455 para la brand 1
        Test 2: petición a las 16:00 del día 14 del producto 35455 para la brand 1
        Test 3: petición a las 21:00 del día 14 del producto 35455 para la brand 1
        Test 4: petición a las 10:00 del día 15 del producto 35455 para la brand 1
        Test 5: petición a las 16:00 del día 15 del producto 35455 para la brand 1

         */
        fecha = LocalDateTime.parse("2020-06-14 10:00:00");
        productId = 35455;
        brandId = 1;
        PRICE_ENTITY_1 = new PriceEntity(1,1, LocalDateTime.parse("2020-06-14 00:00:00"), LocalDateTime.parse("2020-12-31 23:59:59"), "1", "35455", 0, BigDecimal.valueOf(35.50), "EUR",LocalDateTime.parse("2025-01-31 23:59:59"),LocalDateTime.parse("2025-11-11 23:59:59"));
        PRICE_ENTITY_2 = new PriceEntity(2,1, LocalDateTime.parse("2020-06-14 15:00:00"), LocalDateTime.parse("2020-06-14 18:30:00"), "2", "35455", 0, BigDecimal.valueOf(25.45), "EUR",LocalDateTime.parse("2025-01-31 23:59:59"),LocalDateTime.parse("2025-11-11 23:59:59"));
        PRICE_ENTITY_3 = new PriceEntity(3,1, LocalDateTime.parse("2020-06-15 00:00:00"), LocalDateTime.parse("2020-06-15 11:00:00"), "3", "35455", 0, BigDecimal.valueOf(30.50), "EUR",LocalDateTime.parse("2025-01-31 23:59:59"),LocalDateTime.parse("2025-11-11 23:59:59"));
        PRICE_ENTITY_4 = new PriceEntity(4,1, LocalDateTime.parse("2020-06-15 00:00:00"), LocalDateTime.parse("2020-06-15 11:00:00"), "3", "35455", 0, BigDecimal.valueOf(30.50), "EUR",LocalDateTime.parse("2025-01-31 23:59:59"),LocalDateTime.parse("2025-11-11 23:59:59"));
        
        PRICE_1_DTO = new PriceDTO(LocalDateTime.parse("2020-06-14 10:00:00"), 35455, 1);
        PRICE_2_DTO = new PriceDTO(LocalDateTime.parse("2020-06-14 16:00:00"), 35455, 1);
        PRICE_3_DTO = new PriceDTO(LocalDateTime.parse("2020-06-14 21:00:00"), 35455, 1);
        PRICE_4_DTO = new PriceDTO(LocalDateTime.parse("2020-06-15 10:00:00"), 35455, 1);
        PRICE_5_DTO = new PriceDTO(LocalDateTime.parse("2020-06-15 16:00:00"), 35455, 1);

        PRICE_1_RESPONSE = new PriceResponse("35455", "1", "1", LocalDateTime.parse("2020-06-14 10:00:00"), BigDecimal.valueOf(35.50));
       
    }

}
