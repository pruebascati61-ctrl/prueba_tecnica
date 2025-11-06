package com.prueba.application.service;

import com.prueba.DataMock;
import com.prueba.application.dto.PriceDTO;
import com.prueba.application.repository.PriceRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.time.LocalDateTime;
import java.util.List;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.when;

public class PriceServiceTest {
    @Mock
    private PriceRepository repositoryMock;

    @InjectMocks
    private PriceService service;


    @Test
    @DisplayName("findByPrice should works")
    void findByPrice(){
        var expected = DataMock.PRICE_1_RESPONSE;
        when(this.repositoryMock.findByPriceDTO(DataMock.fecha,DataMock.productId,DataMock.brandId))
                .thenReturn(anyList());
        var result = this.service.getPrices(DataMock.fecha,DataMock.productId,DataMock.brandId);

        assertEquals(DataMock.PRICE_1_DTO, result.get(0));

    }




}

