package Clase6;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio8PiedraPapelTijera {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int opcionUsuario;
        int opcionPC;

        System.out.println("[Bienvenido al Juego: Piedra, Papel ó Tijera]");
        System.out.println("Elija un número para hacer la jugada: [ 1) Piedra ] [ 2) Papel ] [ 3) Tijera ]");

        opcionUsuario = teclado.nextInt();
        opcionPC = aleatorio.nextInt(3)+1; // devuelve un random desde 0 hasta 3. (0,1,2). Le sumamos 1 para que coincida con el menu.

        if (opcionUsuario == opcionPC){
            System.out.println("Ha empatado:");
        } else if (
                (opcionUsuario == 1 && opcionPC == 3) ||
                (opcionUsuario == 2 && opcionPC == 1) ||
                (opcionUsuario == 3 && opcionPC == 2)) {
            System.out.println("Ha ganado");
        } else {
            System.out.println("Ha perdido");
        }

        switch (opcionUsuario) {
            case 1 -> System.out.println("opcionUsuario = Piedra");
            case 2 -> System.out.println("opcionUsuario = Papel");
            case 3 -> System.out.println("opcionUsuario = Tijera");
        }

        switch (opcionPC) {
            case 1 -> System.out.println("opcionPC = Piedra");
            case 2 -> System.out.println("opcionPC = Papel");
            case 3 -> System.out.println("opcionPC = Tijera");
        }
   }
}
