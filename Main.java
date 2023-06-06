import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        /*
         1) Calculadora de edad de perros:
         Pídele al usuario que ingrese la edad de su perro.
         Convierte esa edad a años de perro (se dice que 1 año humano equivale a 7 años de perro).
        */

        System.out.println("[Calculadora de edad de perros]");
        System.out.println("Ingrese la edad de su perro:");

        Integer edadPerro = teclado.nextInt();
        Integer edadPerroConvertida = edadPerro * 7;

        System.out.println("La edad del perro es: " + edadPerro + " y convertido en años humanos es: " + edadPerroConvertida);

        /*
         2) Conversor de millas a kilómetros:
         Pídele al usuario que ingrese una distancia en millas.
         Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
         Muestra la distancia en kilómetros al usuario.
        */

        System.out.println("[Conversor de millas a kilómetros]");
        System.out.println("Ingrese una distancia en millas:");

        Double millas = teclado.nextDouble();
        Double kilometros = millas * 1.60934;

        System.out.println("La distancia ingresada en millas es: " + millas + " Y convertida a kilometros es: " + kilometros);

        /*
         3) Calculadora de descuento:
         Pídele al usuario que ingrese el precio original de un producto.
         Pídele al usuario que ingrese el porcentaje de descuento.
         Calcula el precio final después de aplicar el descuento utilizando la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
         Muestra el precio final al usuario.
        */

        System.out.println("[Calculadora de descuento]");

        System.out.println("Ingrese precio original del producto:");
        Double precioOriginal = teclado.nextDouble();

        System.out.println("Ingrese porcentaje de descuento:");
        Double descuento = teclado.nextDouble();

        Double precioFinal = precioOriginal - (precioOriginal * descuento / 100);
        System.out.println("El precio final con el descuento es: $" + precioFinal);

        /*
         4) Calculadora de propinas:
         Pídele al usuario que ingrese el total de la cuenta en un restaurante.
         Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
         Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100).
        */

        System.out.println("[Calculadora de propinas]");

        System.out.println("Ingrese el total de la cuenta:");
        Double totalCuenta = teclado.nextDouble();

        System.out.println("Ingrese el porcentaje de propina que desea dejar:");
        Double porcentajePropina = teclado.nextDouble();

        Double propina = totalCuenta * (porcentajePropina / 100);
        System.out.println("El porcentaje de propina que se desea es: " + propina);

        /*
         5) Juego de adivinar el número:
         Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número.
        */

        Integer secreto =(int)(Math.random()*10)*100;

        System.out.println("Ingrese un numero entre 1-100 para adivinar el numero secreto:");
        Integer num = teclado.nextInt();

        if (num.equals(secreto)) {
            System.out.println("Felicitacion acertaste el numero secreto es: " + secreto);
        } else {
            System.out.println("Numero incorrecto, no adivinaste. El numero secreto era: " + secreto);
        }

    }
}
