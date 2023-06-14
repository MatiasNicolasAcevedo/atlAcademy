package Clase8;

public class Ejercicio2AreaTriangulo {

    public static void main(String[] args) {

        /*
          2) Hacer una función que calcule el área de un triángulo. Al llamarla debe devolver el área del triángulo.
        */

        double base = 5.5;
        double altura = 4.3;
        double area;

        area = calcularAreaTriangulo(base, altura);
        System.out.println("area triangulo = " + area);
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura)/2;
    }
}
