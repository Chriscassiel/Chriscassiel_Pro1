import java.util.Scanner;

public class Ejercicios2 {
    public static void main(String[] args) {
        int numeroGanador = (int) (Math.random() * 9000) + 1000;

        Scanner lectorTeclado = new Scanner(System.in);

        System.out.println("Ingresa un numero entre 1000 y 9999: ");
        int numeroIngresado = lectorTeclado.nextInt();

        boolean numeroAceptado = (numeroIngresado >999 && numeroIngresado <10000);

        if (numeroAceptado) {
            System.out.println("Numero Aceptado");

        } else {
            System.out.println("Numero no valido");}

        double unidad1 = (numeroGanador % 10);
        double decena1 = (numeroGanador / 10) % 10;
        double centena1 = (numeroGanador / 100) % 10;
        double unidadDeMil1 = (numeroGanador / 1000);


        double unidad2 = (numeroIngresado % 10);
        double decena2 = (numeroIngresado / 10) % 10;
        double centena2 = (numeroIngresado / 100) % 10;
        double unidadDeMil2 = (numeroIngresado / 1000);

        boolean CuartoNumero = unidad1 == unidad2;
        boolean TercerNumero = decena1 == decena2;
        boolean SegundoNumero = centena1 == centena2;
        boolean PrimerNumero = unidadDeMil1 == unidadDeMil2;

        boolean todosLosNumeros = (CuartoNumero && TercerNumero && SegundoNumero && PrimerNumero);

        if (numeroAceptado) {
            System.out.println("El numero ganador es: "+ numeroGanador);

            System.out.println("Has acertado el primer numero: " + CuartoNumero);
            System.out.println("Has acertado el primer numero: " + TercerNumero);
            System.out.println("Has acertado el primer numero: " + SegundoNumero);
            System.out.println("Has acertado el primer numero: " + PrimerNumero);
            System.out.println("Has acertado todos los numeros: " + todosLosNumeros);
        }else {
            System.out.println("Porfavor intentalo de nuevo ");
        }
    }
}
