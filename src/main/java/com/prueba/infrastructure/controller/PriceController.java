package com.prueba.infrastructure.controller;

import com.prueba.application.service.PriceService;
import com.prueba.domain.Price;
import com.prueba.infrastructure.adapter.output.PriceResponse;
import com.prueba.infrastructure.mapper.PriceMapper;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/prueba/prices")
@Slf4j
public class PriceController {
    private final PriceService priceService;
    private final PriceMapper priceMapper;
    public PriceController(PriceService priceService, PriceMapper priceMapper)
    {
        this.priceService = priceService;
        this.priceMapper = priceMapper;
    }


    @GetMapping("/show")
    public String showPrice(Model model, HttpSession httpSession){

        Iterable<Price> prices = priceService.getAllPrices();
        model.addAttribute("prices", prices);
        return "prueba/prices/show";
    }

    @GetMapping("/show/price")
    public ResponseEntity<List<PriceResponse>> getPrices(LocalDateTime fecha, Integer idProducto, Integer idCadena)
    {
        List<Price> prices = priceMapper.toPrices(priceService.getPrices(fecha, idProducto, idCadena));
        List<PriceResponse> response = priceMapper.toPriceResponse(prices);
        return ResponseEntity.ok().body(response);
    }


}
