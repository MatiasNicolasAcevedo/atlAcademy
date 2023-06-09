package Clase5;

import java.util.Scanner;

public class Ejercicio1CalculadoraPerro {
    public static void main(String[] args) {

        /*
          1) Calculadora de edad de perros:
          Pídele al usuario que ingrese la edad de su perro.
          Convierte esa edad a años de perro (se dice que 1 año humano equivale a 7 años de perro).
        */

        Scanner teclado = new Scanner(System.in);

        System.out.println("[Calculadora de edad de perros]");
        System.out.println("Ingrese la edad de su perro:");

        Integer edadPerro = teclado.nextInt();
        Integer edadPerroConvertida = edadPerro * 7;

        System.out.println("La edad del perro es: " + edadPerro + " y convertido en años humanos es: " + edadPerroConvertida);

    }
}
