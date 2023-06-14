package Clase8;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5PiedraPapelTijera {

    public static void main(String[] args) {

        /*
          5) Hacer nuevamente el juego de Piedra, Papel o Tijeras pero utilizando funciones, arreglos y bucles.
        */

        String[] opciones = {"Piedra", "Papel", "Tijera"};
        int opcionUsuario;
        int opcionMaquina;
        boolean salir;

        System.out.println("[Bienvenido al Juego: Piedra, Papel o Tijera]");

        do {
            System.out.println("Elija un número para hacer la jugada: [1- Piedra] [2- Papel] [3- Tijera]");
            opcionUsuario = playUsuario(opciones);
            opcionMaquina = playMaquina(opciones);
            decidirGanador(opcionUsuario, opcionMaquina);
            salir = seguirJugando();
        } while (salir);
    }

    public static int playUsuario(String[] opciones) {
        Scanner teclado = new Scanner(System.in);
        int x = teclado.nextInt();
        System.out.println("opcionUsuario = " + opciones[x-1]);
        return x;
    }

    private static int playMaquina(String[] opciones) {
        Random random = new Random();
        int x = random.nextInt(3)+1;
        System.out.println("opcionMaquina = " + opciones[x-1]);
        return x;
    }

    public static void decidirGanador(int opcionUsuario, int opcionMaquina) {
        if (opcionUsuario == opcionMaquina) {
            System.out.println("Ha empatado");
        } else if ((opcionUsuario == 1 && opcionMaquina == 3) ||
                   (opcionUsuario == 2 && opcionMaquina == 1) ||
                   (opcionUsuario == 3 && opcionMaquina == 2)) {
            System.out.println("Ha ganado");
        } else {
            System.out.println("Ha perdido");
        }
    }

    public static boolean seguirJugando() {
        System.out.println("Desea seguir jugando (S/N)");
        boolean salir = false;
        Scanner teclado = new Scanner(System.in);
        String x = teclado.next().toLowerCase();
        if (x.equals("s")) salir = true;
        return salir;
    }
}
