package ru.alfabank.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.alfabank.feign.ExchangeRatesFeignClient;

@Service
@RequiredArgsConstructor
public class ExchangeRatesServiceImpl implements ExchangeRatesService {
    private static final String APP_ID = "0e93de1be2d949089c50165c7edf5913";

    private final ExchangeRatesFeignClient ratesFeignClient;

    @Override
    public Object getRate(String code) {
        return ratesFeignClient.getRate(APP_ID, code);
    }
}
