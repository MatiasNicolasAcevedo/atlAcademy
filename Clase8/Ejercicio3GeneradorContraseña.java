package Clase8;

public class Ejercicio3GeneradorContraseña {

    public static void main(String[] args) {

        /*
          3) Crear una función que sea un generador de contraseñas.
          Al llamarla debe devolver una contraseña, por ejemplo,
          puedes utilizar Math.random() para devolver un número aleatorio que podría ser una contraseña.
        */

        int password;

        password = generadorPassword();

        System.out.println("password = " + password);

    }

    public static int generadorPassword() {
        return (int)(Math.random()*1000000);
    }
}
