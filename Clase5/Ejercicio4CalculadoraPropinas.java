package Clase5;

import java.util.Scanner;

public class Ejercicio4CalculadoraPropinas {
    public static void main(String[] args) {

        /*
          4) Calculadora de propinas:
          Pídele al usuario que ingrese el total de la cuenta en un restaurante.
          Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
          Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100).
        */

        Scanner teclado = new Scanner(System.in);

        System.out.println("[Calculadora de propinas]");

        System.out.println("Ingrese el total de la cuenta:");
        Double totalCuenta = teclado.nextDouble();

        System.out.println("Ingrese el porcentaje de propina que desea dejar:");
        Double porcentajePropina = teclado.nextDouble();

        Double propina = totalCuenta * (porcentajePropina / 100);
        System.out.println("El porcentaje de propina que se desea es: " + propina);

    }
}
