import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);

        System.out.println("Ingresa un numero del 1 al 12: ");
        int mes = lectorTeclado.nextInt();

        boolean mesValido = mes > 0 && mes < 13;
        if (mesValido) {
            System.out.println("Numero valido");
            switch (mes) {

                case 1:
                    System.out.println("Este mes se encuentra en invierno");
                    break;

                case 2:
                    System.out.println("Este mes se encuentra en invierno");
                    break;

                case 3:
                    System.out.println("Este mes se encuentra en invierno");
                    break;

                case 4:
                    System.out.println("Este mes se encuentra en primavera");
                    break;

                case 5:
                    System.out.println("Este mes se encuentra en primavera");
                    break;

                case 6:
                    System.out.println("Este mes se encuentra en primavera");
                    break;

                case 7:
                    System.out.println("Este mes se encuentra en verano");
                    break;

                case 8:
                    System.out.println("Este mes se encuentra en verano");
                    break;

                case 9:
                    System.out.println("Este mes se encuentra en verano");
                    break;

                case 10:
                    System.out.println("Este mes se encuentra en otoño");
                    break;

                case 11:
                    System.out.println("Este mes se encuentra en otoño");
                    break;

                case 12:
                    System.out.println("Este mes se encuentra en otoño");
                    break;

                default:
            }
        }else {
            System.out.println("No has introducido un numero valido");
        }
    }
}
