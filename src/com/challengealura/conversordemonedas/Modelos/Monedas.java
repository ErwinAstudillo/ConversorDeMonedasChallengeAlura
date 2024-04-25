package com.challengealura.conversordemonedas.Modelos;

import com.challengealura.conversordemonedas.API.ExchangeRateAPI;

public class Monedas {
    private final double resultado;
    private final String monedaOrigen;
    private final String monedaDestino;

    public double getValor() {
        return resultado;
    }

    public Monedas(ExchangeRateAPI exchange) {
        this.resultado = exchange.conversion_rate();
        this.monedaOrigen = exchange.base_code();
        this.monedaDestino = exchange.target_code();
    }

    @Override
    public String toString() {
        return "Moneda origen= " + monedaOrigen + ", Moneda destino= " +
                        monedaDestino + "Resultado= " + resultado +
                '}';
    }
}
