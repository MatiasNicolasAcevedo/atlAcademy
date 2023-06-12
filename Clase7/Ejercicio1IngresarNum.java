package Clase7;

import java.util.Scanner;

public class Ejercicio1IngresarNum {
    public static void main(String[] args) {

        // declaran las variables
        Scanner teclado = new Scanner(System.in);
        double[] numbers = new double[5];
        double mayor;
        double menor;
        double promedio;

        // recorremos el array y se cargan los num, de acuerdo al indice i.
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Ingrese un número:");
            numbers[i] = teclado.nextDouble();
        }

        // buscamos el mayor y menor
        mayor = 0;
        menor = 0;
        promedio = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]); // se imprimen los valores.
            double num = numbers[i];

            // con i == 0, nos aseguramos que la 1ra vez que ingresa tome valor la variable menor.
            if (num < menor || i == 0) {menor = num;}
            if (num > mayor || i == 0) {mayor = num;}

            // calculamos el promedio
            promedio += num; // se suma al valor de promedio, lo que vale num en cada iteración.
            if (i == numbers.length-1) { // cuando sea i == numbers.length -> significa que es la ultima iteracion, se le -1 para el index del array.
                promedio = promedio / numbers.length;
                System.out.println("El promedio es: " + promedio);
            }
        }
    }
}
