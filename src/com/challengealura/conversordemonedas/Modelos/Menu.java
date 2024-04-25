package com.challengealura.conversordemonedas.Modelos;

public class Menu {
    private String monedaOrigen = "";
    private String monedaDestino ="";

    public String opcionesOrigen(){
        return """
                **************************************************************
                Digite la opción de la moneda que desea convertir
                
                1 - ARS - Peso argentino
                2 - BOB - Boliviano boliviano
                3 - BRL - Real brasileño
                4 - CLP - Peso chileno
                5 - COP - Peso colombiano
                6 - USD - Dólar estadounidense
                
                9 - SALIR
                
                **************************************************************
                """;
    }

    public String opcionesDestino(){
        return """
                **************************************************************
                Digite la opción de la moneda a la que desea convertir
                
                1 - ARS - Peso argentino
                2 - BOB - Boliviano boliviano
                3 - BRL - Real brasileño
                4 - CLP - Peso chileno
                5 - COP - Peso colombiano
                6 - USD - Dólar estadounidense
                
                9 - SALIR
                
                **************************************************************
                """;
    }

    public String valorParaConvertir(){
        return """
                **************************************************************
                
                Digite la cantidad que desea convertir: 
                
                **************************************************************""";
    }

    public String getMonedaOrigen(){
        return monedaOrigen;
    }
    public String getMonedaDestino(){
        return monedaDestino;
    }
    public void seleccion(int digito){
        switch (digito){
            case 1:
                if (monedaOrigen.isEmpty()){
                    this.monedaOrigen = "ARS";
                }else {
                    this.monedaDestino = "ARS";
                }
                break;

            case 2:
                if (monedaOrigen.isEmpty()){
                    this.monedaOrigen = "BOB";
                }else {
                    this.monedaDestino = "BOB";
                }
                break;

            case 3:
                if (monedaOrigen.isEmpty()){
                    this.monedaOrigen = "BRL";
                }else {
                    monedaDestino = "BRL";
                }
                break;

            case 4:
                if (monedaOrigen.isEmpty()){
                    this.monedaOrigen = "CLP";
                }else {
                    monedaDestino ="CLP";
                }
                break;

            case 5:
                if (monedaOrigen.isEmpty()){
                    this.monedaOrigen = "COP";
                }else {
                    this.monedaDestino = "COP";
                }
                break;

            case 6:
                if (monedaOrigen.isEmpty()){
                    this.monedaOrigen = "USD";
                }else {
                    this.monedaDestino = "USD";
                }
                break;

            default:
                System.out.println("ESCOJA UNA OPCION VALIDA");
        }
    }

    public double getValor() {
        return 0;
    }

}
