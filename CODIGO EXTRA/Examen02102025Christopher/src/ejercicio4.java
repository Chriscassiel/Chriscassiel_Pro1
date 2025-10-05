import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[]arg) {
        Scanner lectorTeclcado = new Scanner(System.in);

        System.out.println("Introduzca su nombre");
        String nombre = lectorTeclcado.nextLine();

        System.out.println("Indica que sueldo esperas");
        int sueldo = lectorTeclcado.nextInt();

        System.out.println("Introduzca su edad: ");
        int edad = lectorTeclcado.nextInt();

        System.out.println("introduzca el dia cumpleaños:");
        int cumpleanos = lectorTeclcado.nextInt();

        System.out.println("Tienes carnet?:");
        boolean tcarnet = lectorTeclcado.hasNextBoolean();

        boolean valido1 = edad <50 && sueldo < 40000 && tcarnet;
        boolean valido2 = edad >45 && sueldo < 20000 && cumpleanos %2 == 0;

        if (valido1 == true) {
            System.out.println("Eres valido");
        }else {
            System.out.println("No eres valido");
        }

    }
}
