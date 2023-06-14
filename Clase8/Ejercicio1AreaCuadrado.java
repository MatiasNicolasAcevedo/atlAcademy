package Clase8;

public class Ejercicio1AreaCuadrado {

    public static void main(String[] args) {

        /*
          1) Hacer una función que calcule el área de un cuadrado. Al llamarla debe devolver el área del cuadrado.
        */

        double lado = 5.5;
        double area;

        area = calcularAreaCuadrado(lado);
        System.out.println("area cuadrado = " + area);
    }

    public static double calcularAreaCuadrado(double lado) {
        return lado * lado;
    }

}
