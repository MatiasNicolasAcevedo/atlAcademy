package Clase6;

import java.util.Scanner;

public class Ejercicio4EligeTuAventura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido a la historia del futbolista!");
        System.out.println("Eres un talentoso jugador de fútbol y debes tomar decisiones clave en tu carrera.");
        System.out.println("Estás en la final de la Copa del Mundo. Tienes el balón en tus pies, y dos jugadores rivales se acercan a toda velocidad ¿Qué quieres hacer?");
        System.out.println("1. Intentar anotar el gol decisivo.");
        System.out.println("2. Pasar el balón a un compañero de equipo.");
        int decision1 = scanner.nextInt();

        if (decision1 == 1) {
            System.out.println("¡Decidiste intentar anotar el gol decisivo!");
            System.out.println("¿Qué camino quieres tomar ahora?");
            System.out.println("1. Intentar gambetear a los rivales y tomar un disparo desde fuera del área.");
            System.out.println("2. Realizar un regate, abrirse por la banda y luego centrar el balón.");
            int decision2 = scanner.nextInt();

            if (decision2 == 1) {
                System.out.println("Logras evadir con éxito a los rivales..");
                System.out.println("¡Tomaste un disparo desde fuera del área!");
                System.out.println("¡GOOOOL! ¡Has anotado el gol de tu vida y tu equipo es campeón del mundo!");
                System.out.println("¡Felicidades, eres una leyenda del fútbol!");
            } else if (decision2 == 2) {
                System.out.println("¡Realizaste un regate y luego centraste el balón!");
                System.out.println("Lamentablemente, el portero atrapó tu disparo.");
                System.out.println("Salieron de contra y el equipo contrario anota gol");
                System.out.println("Tu equipo perdió la final de la Copa del Mundo.");
                System.out.println("No te preocupes, aún tienes tiempo para redimirte.");
            }
        } else if (decision1 == 2) {
            System.out.println("¡Decidiste pasar el balón a un compañero de equipo!");
            System.out.println("¿Qué camino quieres tomar ahora?");
            System.out.println("1. Pasar el balón a un compañero en la delantera.");
            System.out.println("2. Pasar el balón a un compañero en el medio campo.");
            int decision3 = scanner.nextInt();

            if (decision3 == 1) {
                System.out.println("¡Pasaste el balón a un compañero en la delantera!");
                System.out.println("Tu compañero anotó el gol y tu equipo ganó la final de la Copa del Mundo.");
                System.out.println("Eres un jugador generoso y tu visión de juego es admirada por todos.");
                System.out.println("¡Felicidades, has dejado tu marca en la historia del fútbol!");
            } else if (decision3 == 2) {
                System.out.println("¡Pasaste el balón a un compañero en el medio campo!");
                System.out.println("Lamentablemente, tu compañero perdió el balón y el equipo contrario anotó.");
                System.out.println("Tu equipo perdió la final de la Copa del Mundo.");
                System.out.println("No te preocupes, aún tienes tiempo para redimirte.");
            }
        } else {
            System.out.println("¡Opción inválida! La historia ha terminado.");
        }
    }
}
