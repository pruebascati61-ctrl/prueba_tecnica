package com.prueba.infrastructure.controller;

import com.prueba.application.dto.PriceDTO;
import com.prueba.application.service.PriceService;
import com.prueba.domain.Price;

//import jakarta.servlet.http.HttpSession;
//import lombok.extern.slf4j.Slf4j;
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.List;
//
//@RestController
//@RequestMapping("/prueba/prices")
//@Slf4j
//public class PriceController {
//    private final PriceService priceService;
//
//    public PriceController(PriceService priceService)
//    {
//        this.priceService = priceService;
//    }
//
//
//    @GetMapping("/show/price")
//    public ResponseEntity<List<PriceDTO>> getPrices(String fecha, String idProducto, Integer idCadena)
//    {
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        LocalDateTime fechaL = LocalDateTime.parse(fecha, formatter);
//
//        List<PriceDTO> response = this.priceService.getPrices(fechaL, idProducto, idCadena);
//        return ResponseEntity.ok().body(response);
//    }
import com.prueba.infrastructure.adapter.PriceCrudRepository;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/prueba/prices")
public class PriceController {

    private final PriceCrudRepository priceRepository;

    public PriceController(PriceCrudRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    @GetMapping("/show")
    public ResponseEntity<List<PriceDTO>> getPrices(
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime fecha,
            @RequestParam Integer productId,
            @RequestParam Integer brandId) {

        List<PriceDTO> response = priceRepository.findByPriceDTO(fecha, productId, brandId);
        return ResponseEntity.ok(response);
    }
}

