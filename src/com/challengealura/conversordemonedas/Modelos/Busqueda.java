package com.challengealura.conversordemonedas.Modelos;

import com.challengealura.conversordemonedas.API.ExchangeRateAPI;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Busqueda {
    private double resultado;

    public double getValor() {
        return resultado;
    }

    public void generaDireccion(String valorOrigen, String valorDestino) throws IOException, InterruptedException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();


        try {
            HttpClient client = HttpClient.newHttpClient();
            String direccion = "https://v6.exchangerate-api.com/v6/128f442196f9351e550efbbd/pair/";
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion + valorOrigen + "/" + valorDestino))
                    .build();
            HttpResponse<String> response = client
                    .send(request,HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            //System.out.println(json);
            ExchangeRateAPI exchange = gson.fromJson(json, ExchangeRateAPI.class);
            //System.out.println(exchange);
            Monedas monedas = new Monedas(exchange);
            //System.out.println(monedas);
            resultado = monedas.getValor();


        }catch (NumberFormatException e){
            System.out.println("Ocurrió un error: ");
            System.out.println(e.getMessage());
        }
    }
}