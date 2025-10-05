import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Indica tu nombre y apellido:");
        String nombre = lectorTeclado.nextLine();

        System.out.println("Indica cuanto dinero dispones para hacer la compra: ");
        double dinero = lectorTeclado.nextDouble();

        System.out.println("Indica cuanto cuesta la play 5 que te quieres comprar (Precio sin IVA): ");
        double precioPlay = lectorTeclado.nextDouble();

        System.out.println("Indica cuanto cuesta el iphone que te quieres comprar(PRECIO SIN IVA): ");
        double precioIphone = lectorTeclado.nextDouble();

        System.out.println("Indica el IVA actual: ");
        double porcentajeDeIva = lectorTeclado.nextDouble()/100; //21

        double precioRealplay = precioPlay * (1+porcentajeDeIva);
        double precioRealIphone = precioIphone  * (1+porcentajeDeIva);

        boolean comprarplay = (dinero - precioRealplay >=0) ;
        boolean comprarIphone =(dinero - precioRealIphone >= 0);
        boolean comprarAmbas = (dinero - (precioRealIphone + precioRealplay) >=0);

        System.out.println("Puedes comprarte el play: " + comprarplay);
        System.out.println("Puedes comprarte el iphone: " + comprarIphone);
        System.out.println("Puedes comprarte ambas cosas: " + comprarAmbas);


    }
}