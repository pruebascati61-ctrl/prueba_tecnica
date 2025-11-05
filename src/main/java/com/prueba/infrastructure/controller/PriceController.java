package com.prueba.infrastructure.controller;

import com.prueba.application.service.PriceService;
import com.prueba.domain.Price;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/prueba/prices")
@Slf4j
public class PriceController {
    private final PriceService priceService;

    public PriceController(PriceService priceService) {
        this.priceService = priceService;
    }


    @GetMapping("/show")
    public String showPrice(Model model, HttpSession httpSession){

        Iterable<Price> prices = priceService.getAllPrices();
        model.addAttribute("prices", prices);
        return "prueba/prices/show";
    }

    @GetMapping("/show/price")
    public ResponseEntity<Price> getPrices(LocalDateTime fecha, String idProducto, String idCadena)
    {
        List<Price> prices = priceService.getPrices(fecha, idProducto, idCadena);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
