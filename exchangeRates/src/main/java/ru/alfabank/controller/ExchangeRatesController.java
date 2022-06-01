package ru.alfabank.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.alfabank.service.ExchangeRatesService;

@RestController
@RequiredArgsConstructor
public class ExchangeRatesController {
    private final ExchangeRatesService ratesService;

    @RequestMapping("/rates")
    public ResponseEntity<Object> getRates(@RequestParam String code) {
        return ResponseEntity.ok(ratesService.getRate(code));
    }
}
