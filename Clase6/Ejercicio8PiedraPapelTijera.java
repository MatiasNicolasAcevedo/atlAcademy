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
            System.out.println("Jugador: " + opcionUsuario);
            System.out.println("Computadora: " + opcionPC);
        }






   }
}
