package com.challengealura.conversordemonedas.Principal;

import com.challengealura.conversordemonedas.Modelos.Busqueda;
import com.challengealura.conversordemonedas.Modelos.Menu;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Menu menu = new Menu();
        Scanner teclado = new Scanner(System.in);

        int opcion;
        String monedaUno = "";
        String monedaDos = "";

        while (true) {
            System.out.println(menu.opcionesOrigen());
            Busqueda busqueda = new Busqueda();
            opcion = teclado.nextInt();

            if (opcion == 9) {
                break; // Salir del bucle si se selecciona la opción 9
            } else if (opcion < 1 || opcion > 6) {
                System.out.println("Ingrese una opción válida.");
                continue; // Volver al inicio del bucle si la opción no es válida
            }
            menu.seleccion(opcion);

            System.out.println(menu.opcionesDestino());
            opcion = teclado.nextInt();
            if (opcion == 9) {
                break; // Salir del bucle si se selecciona la opción 9
            } else if (opcion < 1 || opcion > 6) {
                System.out.println("Ingrese una opción válida.");
                continue; // Volver al inicio del bucle si la opción no es válida
            }
            menu.seleccion(opcion);

            while (true) {
                busqueda.generaDireccion(menu.getMonedaOrigen(), menu.getMonedaDestino());
                monedaUno = menu.getMonedaOrigen();
                monedaDos = menu.getMonedaDestino();
                System.out.println(menu.valorParaConvertir());
                double cantidad = teclado.nextDouble();
                double resultado = cantidad * busqueda.getValor();
                System.out.println(cantidad + " " + monedaUno + " equivale a " + resultado + monedaDos);

                System.out.println("¿Desea realizar otra conversión? (S/N)");
                String continuar = teclado.next();
                if (!continuar.equalsIgnoreCase("S")) {
                    break; // Salir del bucle interno si no se desea continuar
                }
            }
        }
    }
}
