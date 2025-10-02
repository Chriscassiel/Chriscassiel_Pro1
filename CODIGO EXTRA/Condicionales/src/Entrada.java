public class Entrada {
    public static void main(String[] args) {
        String mensaje;
        int numero = 2;

        // Evaluamos si el número es positivo o negativo
        if (numero <= 0) {
            mensaje = "positivo";
        } else {
            mensaje = "negativo";
        }

        System.out.println("El resultado es: " + mensaje);

        // Evaluamos en qué rango está el número
        if (numero >= 0 && numero < 10) {
            System.out.println("El número está entre 0 y 9.99");
        } else if (numero >= 10 && numero < 100) {
            System.out.println("El número está entre 10 y 99.99");
        } else if (numero >= 100 && numero < 1000) {
            System.out.println("El número está entre 100 y 999.99");
        } else {
            System.out.println("El número no está entre los anteriores");
        }

        // Evaluación adicional si el número es negativo
        if (numero < 0) {
            System.out.println("Número negativo, no vales");
        }
    }
}