package Clase5;

import java.util.Scanner;

public class Ejercicio2ConversorMillas {
    public static void main(String[] args) {

        /*
          2) Conversor de millas a kilómetros:
          Pídele al usuario que ingrese una distancia en millas.
          Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
          Muestra la distancia en kilómetros al usuario.
        */

        Scanner teclado = new Scanner(System.in);

        System.out.println("[Conversor de millas a kilómetros]");
        System.out.println("Ingrese una distancia en millas:");

        Double millas = teclado.nextDouble();
        Double kilometros = millas * 1.60934;

        System.out.println("La distancia ingresada en millas es: " + millas + " Y convertida a kilometros es: " + kilometros);

    }
}
