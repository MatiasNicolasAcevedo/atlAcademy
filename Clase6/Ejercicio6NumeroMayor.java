package Clase6;

import java.util.Scanner;

public class Ejercicio6NumeroMayor {
    public static void main(String[] args) {

        // 6) Armar un programa que permita cargar 3 números y mostrar cual es el mayor y cual es el menor.

        Scanner teclado = new Scanner(System.in);
        Double numero1;
        Double numero2;
        Double numero3;
        Double mayor;
        Double menor;

        System.out.println("[Calcular el Mayor y Menor entre 3 números]");
        System.out.println("Ingrese numero1:");
        numero1 = teclado.nextDouble();

        System.out.println("Ingrese numero2:");
        numero2 = teclado.nextDouble();

        System.out.println("Ingrese numero3:");
        numero3 = teclado.nextDouble();

        mayor = Math.max(numero1, Math.max(numero2, numero3));
        menor = Math.min(numero1, Math.min(numero2, numero3));

        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);

    }
}
