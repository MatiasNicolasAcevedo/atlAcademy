package Clase6;

import java.util.Scanner;

public class Ejercicio3LlamarWhatsapp {
    public static void main(String[] args) {

        /*
          Arma un programa que permita llamar a una persona por Whatsapp. Es similar al anterior.
          Pídele al usuario que ingrese un número de telefono sin espacios, por ejemplo: 5493541539405
          Después muestra en consola la concatenación de:
          “https://api.whatsapp.com/send?phone=” + telefono
        */

        Scanner teclado = new Scanner(System.in);
        String telefono;

        System.out.println("Ingrese un numero de teléfono sin espacios, ni caracteres especiales:");
        telefono = teclado.next();

        System.out.println("Click -> " + "https://api.whatsapp.com/send?phone=" + telefono);

    }
}
