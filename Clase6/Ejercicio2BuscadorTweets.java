package Clase6;

import java.util.Scanner;

public class Ejercicio2BuscadorTweets {
    public static void main(String[] args) {

        /*
          2) Arma un buscador de tweets para Twitter.com. Es bastante similar al anterior.
          Pídele al usuario que ingrese el nombre de una celebridad (de una sola palabra), por ejemplo: “Messi”.
          Después muestra en consola la concatenación de:
          “https://twitter.com/search?q=” + palabra
        */

        Scanner teclado = new Scanner(System.in);
        String celebridad;

        System.out.println("Ingrese el nombre de una celebridad a buscar: (una sola palabra)");
        celebridad = teclado.next();

        System.out.println("Click -> " + "https://twitter.com/search?q=" + celebridad);

    }
}
