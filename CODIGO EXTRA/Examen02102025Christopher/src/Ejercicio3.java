import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Este programa puede detectar si un numero es Armstrong");
        System.out.println("Ingresa un numero de tres digitos");
        int numeroIngresado = lectorTeclado.nextInt();

        boolean numeroValido = numeroIngresado > 100 && numeroIngresado < 1000;

        if (numeroValido) {
            System.out.println("Has escogido un numero valido: ");

            int centena = numeroIngresado / 100;
            int decena = (numeroIngresado / 10) % 10;
            int unidad = numeroIngresado % 10;


            int elevado = (centena * centena * centena) + (decena * decena * decena) + (unidad * unidad * unidad);

            if (numeroIngresado == elevado) {
                System.out.println("Es un numero armstrong");
            } else if (numeroIngresado != elevado) {
                System.out.println("no es un numero armstrong");

            }

        }else {
            System.out.println("No es un numero valido");
        }
    }
}

