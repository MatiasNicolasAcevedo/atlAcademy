package Clase6;

import java.util.Scanner;

public class Ejercicio1BuscadorPaises {
    public static void main(String[] args) {

        /*
          1) Arma un buscador de países con Google Maps.
          Primero, pidele al usuario que ingrese un país (Ej: Colombia).
          Después muestra en consola la concatenación de:
          “https://www.google.com/maps/search/” + pais
          Entonces, cuando hagas click en el link que aparece en consola, te abrirá esa ubicación.
        */

        Scanner teclado = new Scanner(System.in);
        String pais;

        System.out.println("Ingrese un pais a buscar:");
        pais = teclado.next();

        System.out.println("Click -> " + "https://www.google.com/maps/search/" + pais);

    }
}

