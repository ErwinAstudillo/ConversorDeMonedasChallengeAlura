package com.challengealura.conversordemonedas.API;

public record ExchangeRateAPI(String base_code, String target_code, double conversion_rate) {
}
