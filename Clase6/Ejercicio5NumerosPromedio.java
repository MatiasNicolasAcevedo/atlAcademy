package Clase6;

import java.util.Scanner;

public class Ejercicio5NumerosPromedio {
    public static void main(String[] args) {

        // 5) Armar un programa que permita cargar 3 números y mostrar cual es el número promedio.

        Scanner teclado = new Scanner(System.in);
        Double numero1;
        Double numero2;
        Double numero3;
        Double promedio;

        System.out.println("[Calcular el promedio de 3 números]");
        System.out.println("Ingrese numero1:");
        numero1 = teclado.nextDouble();

        System.out.println("Ingrese numero2:");
        numero2 = teclado.nextDouble();

        System.out.println("Ingrese numero3:");
        numero3 = teclado.nextDouble();

        promedio = (numero1 + numero2 + numero3) / 3;
        System.out.println("El promedio de los números: " + numero1 + " ," + numero2 + " ," + numero3 + " es: " + promedio);
    }
}
