package com.prueba.infrastructure.controller;

import com.prueba.application.service.PriceService;
import com.prueba.domain.Price;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequestMapping("/prueba/prices")
@Slf4j
public class PriceController {
    private final PriceService priceService;

    public PriceController(PriceService priceService) {
        this.priceService = priceService;
    }


    @GetMapping("/show")
    public String showPrice(Model model, HttpSession httpSession){

        Iterable<Price> prices = priceService.getPrices();
        model.addAttribute("prices", prices);
        return "prueba/prices/show";
    }



}
