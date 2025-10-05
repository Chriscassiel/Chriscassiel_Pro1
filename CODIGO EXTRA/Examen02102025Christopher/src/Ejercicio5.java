
import java.util.Scanner;


public class Ejercicio5 {

    public static void main(String[] args) {


        Scanner lectorTeclado = new Scanner(System.in);
        double precioHamburguesa = 6.5;
        double precioPizza = 7.0;
        double precioEnsalada = 5.0;
        double ultimoPrecio = 0.0;

        System.out.println("Cual es tu nombre:");
        String nombre = lectorTeclado.nextLine();

        System.out.println("(1)Hamburguesa: " + precioHamburguesa);
        System.out.println("(2)Pizza: " + precioPizza);
        System.out.println("(3)Ensalada: " + precioEnsalada);

        System.out.println("Que quieres comer: ");
        int comida = lectorTeclado.nextInt();


        boolean opciónValida = comida > 0 && comida < 4;

        if (opciónValida) {

            switch (comida) {

                case 1:
                    ultimoPrecio = precioHamburguesa;
                    System.out.println("Vale una hamburguesa");
                    break;

                case 2:
                    ultimoPrecio = precioPizza;
                    System.out.println("Vale una pizza");
                    break;

                case 3:
                    ultimoPrecio = precioEnsalada;
                    System.out.println("Vale una ensalada");
                    break;

                default:
            }

            System.out.println("Tienes un cupon?");
            boolean tcupon = lectorTeclado.nextBoolean();

            if (tcupon) {
                System.out.println("Se te aplicara un 10% de descuento!");
                double precioConCupon = ultimoPrecio * 0.9;

                System.out.printf("Vale %s el precio seria: %.2f\n", nombre, precioConCupon);
            } else {
                System.out.printf("Vale %s el precio sin cupon es de: %.2f\n", nombre, ultimoPrecio);
            }
        }else {
            System.out.println("No es una opcion Valida");
        }
    }
}
