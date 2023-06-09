package Clase5;

import java.util.Scanner;

public class Ejercicio5AdivinarNumero {
    public static void main(String[] args) {

        /*
          5) Juego de adivinar el número:
          Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número.
        */

        Scanner teclado = new Scanner(System.in);

        Integer secreto =(int)(Math.random()*100);

        System.out.println("Ingrese un numero entre 1-100 para adivinar el numero secreto:");
        Integer num = teclado.nextInt();

        if (num.equals(secreto)) {
            System.out.println("Felicitaciones acertaste el numero secreto es: " + secreto);
        } else {
            System.out.println("Numero incorrecto, no adivinaste. El numero secreto era: " + secreto);
        }
    }
}
