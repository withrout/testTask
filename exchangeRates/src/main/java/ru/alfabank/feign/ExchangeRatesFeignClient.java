package ru.alfabank.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "exchange", url = "https://openexchangerates.org/api/latest.json/")
public interface ExchangeRatesFeignClient {
    @GetMapping
    Object getRate(@RequestParam String app_id, @RequestParam String symbols);
}