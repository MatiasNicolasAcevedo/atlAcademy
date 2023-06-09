package Clase5;

import java.util.Scanner;

public class Ejercicio3CalculadoraDescuento {
    public static void main(String[] args) {

        /*
          3) Calculadora de descuento:
          Pídele al usuario que ingrese el precio original de un producto.
          Pídele al usuario que ingrese el porcentaje de descuento.
          Calcula el precio final después de aplicar el descuento utilizando la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
          Muestra el precio final al usuario.
        */

        Scanner teclado = new Scanner(System.in);

        System.out.println("[Calculadora de descuento]");

        System.out.println("Ingrese precio original del producto:");
        Double precioOriginal = teclado.nextDouble();

        System.out.println("Ingrese porcentaje de descuento:");
        Double descuento = teclado.nextDouble();

        Double precioFinal = precioOriginal - (precioOriginal * descuento / 100);
        System.out.println("El precio final con el descuento es: $" + precioFinal);

    }
}
