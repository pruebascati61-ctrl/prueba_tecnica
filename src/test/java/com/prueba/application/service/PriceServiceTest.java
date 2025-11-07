package com.prueba.application.service;

import com.prueba.DataMock;

import com.prueba.application.dto.PriceDTO;
import com.prueba.infrastructure.adapter.PriceRepositoryImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PriceServiceTest {

    @Mock
    private PriceRepositoryImpl repositoryMock;

    @InjectMocks
    private PriceService service;


    @Test
    @DisplayName("test1FindByPrice should work")
    void test1FindByPrice() {
        //Test 1: petición a las 10:00 del día 14 del producto 35455 para la brand 1

        LocalDateTime fechaPeticion = LocalDateTime.of(2020,6,14, 10, 0,0);
        Integer productId = 35455;
        Integer brandId = 1;
        when(repositoryMock.findByPriceDTO(fechaPeticion, productId, brandId))
                .thenReturn(DataMock.LISTADTO);

        var result = service.getPrices(fechaPeticion, productId, brandId);


        assertEquals(DataMock.PRICE_1_DTO.price(), result.get(0).price());
        assertEquals(DataMock.PRICE_1_DTO.productId(), result.get(0).productId());
        assertEquals(DataMock.PRICE_1_DTO.brandId(), result.get(0).brandId());
    }
    //Test 2: petición a las 16:00 del día 14 del producto 35455 para la brand 1
    @Test
    @DisplayName("test2FindByPrice should work")
    void test2FindByPrice() {

        LocalDateTime fechaPeticion = LocalDateTime.of(2020,6,14, 16, 0,0);
        Integer productId = 35455;
        Integer brandId = 1;
        when(repositoryMock.findByPriceDTO(fechaPeticion, productId, brandId))
                .thenReturn(DataMock.LISTADTO);

        var result = service.getPrices(fechaPeticion, productId, brandId);


        assertEquals(DataMock.PRICE_1_DTO.price(), result.get(0).price());
        assertEquals(DataMock.PRICE_1_DTO.productId(), result.get(0).productId());
        assertEquals(DataMock.PRICE_1_DTO.brandId(), result.get(0).brandId());
    }

    //Test 3: petición a las 21:00 del día 14 del producto 35455 para la brand 1
    @Test
    @DisplayName("test3FindByPrice should work")
    void test3FindByPrice() {

        LocalDateTime fechaPeticion = LocalDateTime.of(2020,6,14, 21, 0,0);
        Integer productId = 35455;
        Integer brandId = 1;
        when(repositoryMock.findByPriceDTO(fechaPeticion, productId, brandId))
                .thenReturn(DataMock.LISTADTO);

        var result = service.getPrices(fechaPeticion, productId, brandId);

        assertEquals(DataMock.PRICE_1_DTO.price(), result.get(0).price());
        assertEquals(DataMock.PRICE_1_DTO.productId(), result.get(0).productId());
        assertEquals(DataMock.PRICE_1_DTO.brandId(), result.get(0).brandId());
    }

    //Test 4: petición a las 10:00 del día 15 del producto 35455 para la brand 1
    @Test
    @DisplayName("test4FindByPrice should work")
    void test4FindByPrice() {

        LocalDateTime fechaPeticion = LocalDateTime.of(2020,6,15, 10, 0,0);
        Integer productId = 35455;
        Integer brandId = 1;
        when(repositoryMock.findByPriceDTO(fechaPeticion, productId, brandId))
                .thenReturn(DataMock.LISTADTO);

        var result = service.getPrices(fechaPeticion, productId, brandId);

        assertEquals(DataMock.PRICE_1_DTO.price(), result.get(0).price());
        assertEquals(DataMock.PRICE_1_DTO.productId(), result.get(0).productId());
        assertEquals(DataMock.PRICE_1_DTO.brandId(), result.get(0).brandId());
    }

    //Test 5: petición a las 16:00 del día 15 del producto 35455 para la brand 1
    @Test
    @DisplayName("test5FindByPrice should work")
    void test5FindByPrice() {

        LocalDateTime fechaPeticion = LocalDateTime.of(2020,6,15, 16, 0,0);
        Integer productId = 35455;
        Integer brandId = 1;
        when(repositoryMock.findByPriceDTO(fechaPeticion, productId, brandId))
                .thenReturn(DataMock.LISTADTO);

        var result = service.getPrices(fechaPeticion, productId, brandId);

        assertEquals(DataMock.PRICE_1_DTO.price(), result.get(0).price());
        assertEquals(DataMock.PRICE_1_DTO.productId(), result.get(0).productId());
        assertEquals(DataMock.PRICE_1_DTO.brandId(), result.get(0).brandId());
    }
}

