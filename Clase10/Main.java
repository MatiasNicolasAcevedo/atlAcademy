package Clase10;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona(22342, "Matias", 31, LocalDate.of(1992, 1, 17), "36666666");

        System.out.println("Es mayor de edad ? " + persona1.esMayorDeEdad());
        System.out.println(persona1);

        Cuenta cuenta1 = new Cuenta(persona1, 5000.4);

        cuenta1.mostrar();
        cuenta1.ingresar(1000.5);
        cuenta1.mostrar();
        cuenta1.retirar(7000.1);
        cuenta1.mostrar();

    }
}