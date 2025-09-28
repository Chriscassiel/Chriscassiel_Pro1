import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicios {


    public void ejercicio1() {
        System.out.println("Ejercicio 1");
        final String nombre = "Christopher";
        final String calle = " C/ Estocolmo ";
        final String provincia = "Madrid";
        final String pais = "España";
        final int codigoPostal = 28922;
        final int piso = 4;
        final String letraDelPiso = "4A";
        final int numeroDePortal = 122;

        System.out.println(nombre);
        System.out.printf("%s, %d, %s\n", calle, numeroDePortal, letraDelPiso);
        System.out.printf("%d, %s %d\n", codigoPostal, provincia, piso);
        System.out.println(pais);
    }

    public void ejercicio2() {
        System.out.println("Ejercicio 2");
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("introduce tu nombre completo: ");
        final String nombre = lectorTeclado.nextLine();
        System.out.println("Intoroduce tu Edad");
        final String edad = lectorTeclado.nextLine();
        //Extra altura
        System.out.println("Introduce tu altura: ");
        //Extra altura
        final float altura = lectorTeclado.nextFloat();
        //Extra boolean Carnet
        System.out.println("¿tienes carnet de conducir? (true/false)");
        boolean tieneCarnet = lectorTeclado.nextBoolean();

        System.out.printf("Te llamas: %s \n", nombre);
        System.out.printf("Y tu edad es: %s\n: ", edad + " años");
        System.out.printf("Mides %.2f\n", altura);
        System.out.printf("Tienes carnet de conducir : %b\n", tieneCarnet);


    }

    public void ejercicio3() {

        System.out.println("Ejercicio 3");
        int numero1 = 24;
        int numero2 = 7;

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int divisionEntera = numero1 / numero2;
        int restoDivision = numero1 % numero2;
        double divisionReal = (double) numero1 / numero2;
        double restoReal = (double) numero1 % numero2;

        System.out.println("La Suma de ambos numeros es: " + suma);
        System.out.println("El Resto de ambos numeros es: " + resta);
        System.out.println("La Multiplicacion de ambos numeros es: " + multiplicacion);
        System.out.println("La Division entera de ambos numeros es: " + divisionEntera);
        System.out.println("El resto de la division de ambos numeros es: " + restoDivision);
        System.out.println("La Division real de ambos numeros es: " + divisionReal);
        System.out.println("EL resto real de ambos numeros es: " + restoReal);

    }

    public void ejercicio4() {

        Scanner lectorTeclado = new Scanner((System.in));
        double precioBebidas = 1.25;
        double precioBocatas = 2.05;


        System.out.println("Camarero: ¿Cuantas bebidas quieren?");
        int numeroBebidas = lectorTeclado.nextInt();

        System.out.println("Camarero: ¿Y cuantos bocatas?");
        int numeroBocatas = lectorTeclado.nextInt();

        System.out.println("Coste de las bebidas: " + numeroBebidas * precioBebidas);
        System.out.println("Coste de los Bocatas: " + numeroBocatas * precioBocatas);

        double totalCuenta = numeroBocatas * precioBocatas + numeroBebidas * precioBebidas;

        System.out.println("Coste Total: " + totalCuenta);

        lectorTeclado.close();

    }

    public void ejercicio5() {

        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Ejercicio5");

        System.out.println("Introduce los numero que quieras pasar de segundos a minutos y horas: ");
        int Segundos = lectorTeclado.nextInt();

        int Horas = Segundos / 3600;
        int RestoDeHoras = Segundos % 3600;
        int Minutos = RestoDeHoras / 60;
        int RestoDeMinutos = RestoDeHoras % 60;
        System.out.println(Segundos + " Te daria un total de: ");
        System.out.printf("Horas: %d\nMinutos: %d\nsegundos:%d\n", Horas, Minutos, RestoDeMinutos);
    }

    public void ejercicio6() {

        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Que precio tiene el movil?");
        double precioMovil = lectorTeclado.nextDouble(); //499.99;

        System.out.println("Cual es el porcentaje del IVA");
        double IVA = lectorTeclado.nextDouble() / 100;

        double ivaTotal = precioMovil * IVA;
        double precioSinIva = precioMovil - ivaTotal;

        System.out.printf("El precio del IVA %.2f", ivaTotal);
        System.out.printf("\nEl precio total del movil sin el iva es de %.2f", precioSinIva);
        lectorTeclado.close();
    }

    public void ejercicio7() {

        System.out.println("Ejercicio 7");
        Scanner lectorTeclado = new Scanner(System.in);

        System.out.println("Introduce el radio de la circunferencia entre 0 y 100: ");
        double radio = lectorTeclado.nextDouble();
        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);
        System.out.printf("El area del circulo es: %.3f\n", area);
        System.out.printf("La Longitud del circulo es: %.2f\n", longitud);
        lectorTeclado.close();
    }

    public void ejercicio8() {
        System.out.println("Ejercicio8");
        Scanner lectorTeclado = new Scanner(System.in);

        System.out.println("Introduce primero grados centigrados: ");
        double ccentigrados = lectorTeclado.nextDouble();

        double cfarenheit = (double) (ccentigrados * 9 / 5) + 32;
        double cKelvin = (double) ccentigrados + 273.15;
        System.out.printf("Farenheit: %.2f\nKelvin: %.2f\n", cfarenheit, cKelvin);

        System.out.println("Ahora introduce grados Farenheit: ");
        double fFarenheit = lectorTeclado.nextDouble();

        double fKelvin = (double) (fFarenheit - 32) * 5 / 9 + 273.15;
        double fCelcius = (double) (fFarenheit - 32) * 5 / 9;

        System.out.printf("Kelvin: %.2f\nCelcius: %.2f\n", fKelvin, fCelcius);

        System.out.println("Exelente! Ahora Calculemos los Kelvin:");
        double kKelvin = lectorTeclado.nextDouble();

        double kCentigrados = (double) kKelvin - 273.15;
        double kfarenheit = (double) (kKelvin - 273.15) * 9 / 5 + 32;

        System.out.printf("Centigrados: %.2f\nFarenheit: %.2f", kCentigrados, kfarenheit);
        System.out.println("\nY ya habriamos terminado el ejercicio");
        lectorTeclado.close();
    }

    public void ejercicio9() {

        System.out.println("ejercicio9");
        Scanner lectorTeclado = new Scanner(System.in);

        double preciodebebida = 2.20;
        double preciodebocata = 4.30;

        System.out.println("Ingrese Cantidad de Bocatas de pollo: ");
        double cantidadDeBocata = lectorTeclado.nextDouble();

        System.out.println("Ingrese Cantidad de Bebidas: ");
        double cantidadDeBebida = lectorTeclado.nextDouble();

        System.out.println("Ingrese Cantidad de alumnos");
        double cantidadDealumnos = lectorTeclado.nextDouble();

        double CosteDeBebida = cantidadDeBebida * preciodebebida;
        double CosteDeBocata = cantidadDeBocata * preciodebocata;
        double CosteTotal = CosteDeBocata + CosteDeBebida;
        System.out.printf(" \nNumero de bebidas (entre 0 y 20):          %.2f", cantidadDeBebida);
        System.out.printf(" \nNumero de Bocadillos (entre 0 y 20):       %.2f", cantidadDeBocata);
        System.out.printf(" \nPrecio de cada bebida (Entre 0,00 y 3,00): %.2f", preciodebebida);
        System.out.printf(" \nPrecio de cada Bocata (entre 0,00 y 3,00): %.2f", preciodebocata);
        System.out.printf(" \nNumero de alumnos (entre 1 y 10):          %.2f", cantidadDealumnos);
        System.out.println("                                                 ");
        System.out.println("\nARTICULO     CANTIDAD        PRECIO       COSTE");
        System.out.printf(" \n==========   ==========      ======        ======");
        System.out.printf(" \nBebida         %.2f,          %.2f,        %.2f", cantidadDeBebida, preciodebebida, CosteDeBebida);
        System.out.printf(" \nBocadillo      %.2f,          %.2f,         %.2f", cantidadDeBocata, preciodebocata, CosteDeBocata);
        System.out.printf(" \nTOTAL                                      %.2f", CosteTotal);
        System.out.printf(" \n-----------------------------------------------");


    }

    public void ejercicio10() {
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Ejercicio10");

        System.out.println("Introduce Decenas de Mil: ");
        int decenasDeMil = lectorTeclado.nextInt();

        System.out.println("Introduce Unidades de mil: ");
        int unidadesDesDeMil = lectorTeclado.nextInt();

        System.out.println("Introduce las centenas:");
        int centenas = lectorTeclado.nextInt();

        System.out.println("Introduce las Decenas: ");
        int decenas = lectorTeclado.nextInt();

        System.out.println("Introduce las Unidades: ");
        int unidades = lectorTeclado.nextInt();

        int Decenademil = decenasDeMil * 10000;
        int Unidadesdemil = unidadesDesDeMil * 1000;
        int Centena = centenas * 100;
        int Decenas = decenas * 10;
        int Unidades = unidades * 1;


        int NumeroIntroducido = Decenademil + Unidadesdemil + Centena + Decenas + Unidades;
        System.out.println("El numero introducido es: " + NumeroIntroducido);
    }

    public void ejercicio11() {

        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Ejercicio11");

        System.out.println("Introduzca un numero del 0 al 100: ");
        int NumeroIntroducido = lectorTeclado.nextInt();

        boolean numeroPar = NumeroIntroducido % 2 == 0;
        boolean numeroMayorCincuenta = NumeroIntroducido > 50;

        System.out.println("Es un numero par: " + numeroPar);
        System.out.println("Es un numero Mayor que 50: " + numeroMayorCincuenta);
    }

    public void ejercicio12() {
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Ejercicio 12");

        System.out.println("Escribe una palabra: ");
        String primeraPalabra = lectorTeclado.nextLine();

        System.out.println("Escribe otra palabra: ");
        String segundaPalabra = lectorTeclado.nextLine();

        boolean esIgual = primeraPalabra.equals(segundaPalabra);
        boolean esDistinta = !primeraPalabra.equals(segundaPalabra);
        boolean esMenor = primeraPalabra.compareTo(segundaPalabra) < 0;

        System.out.println("La primera palabra es igual que la segunda: " + esIgual);
        System.out.println("La primera palabra es lleva menos letras que la segunda: " + esMenor);
        System.out.println("La primera palabra es Distinta que la segunda: " + esDistinta);
    }

    public void ejercicio13() {
        Scanner lectorTexto = new Scanner(System.in);
        System.out.println("Ejercicio 13");

        System.out.println("Escribe un numero entre 0 y 9:");
        int PrimerNum = lectorTexto.nextInt();
        boolean Solo = PrimerNum > 0 && PrimerNum < 9;

        System.out.println("Escribe otro numero entre 0 y 9: ");
        int segundoNum = lectorTexto.nextInt();
        boolean Solo2 = segundoNum > 0 && segundoNum < 9;

        boolean ParImpar = (PrimerNum % 2 == 0) && (segundoNum % 2 == 1);
        System.out.println("El primer numero es par y el segundo impar:" + ParImpar);

        boolean suDoSeIna8 = (PrimerNum > segundoNum * 2) && (PrimerNum < 8);
        System.out.println("El primero es superior al doble del segundo e inferior a 8: " + suDoSeIna8);

        boolean Soiguomen2 = (PrimerNum == segundoNum) || (PrimerNum - segundoNum < 2 && PrimerNum - segundoNum > -2);
        System.out.println("Son iguales o la diferencia entre el primero y el segundo es menor que 2: " + Soiguomen2);


    }

    public void ejercicio14() {
        Scanner lectorTeclado = new Scanner(System.in);

        System.out.println("Que edad Tienes?: ");
        int Edad = lectorTeclado.nextInt();
        boolean edadde = Edad > 0 && Edad < 100;
        System.out.println("Edad: " + edadde);

        System.out.println("Que nivel de estudios tienes?: ");
        int NDS = lectorTeclado.nextInt();
        boolean Niveles = NDS > 0 && NDS < 10;
        System.out.println("Nivel de estudios: " + Niveles);

        System.out.println("Cuales son rus ingresos: ");
        int Ingresos = lectorTeclado.nextInt();
        boolean Ing = Ingresos > 0 && Ingresos < 25000;
        System.out.println("Sus ingresos son: " + Ing);

        boolean Requisito1 = Edad > 40;
        boolean Requisito2 = NDS > 4 && NDS < 9;
        boolean Requisito3 = Ingresos < 15000;
        boolean TodosRequisitos = Requisito1 && Requisito2 && Requisito3;
        System.out.println("Mas de 40 años y estudios entre 5 y gana menos de 15000: " + TodosRequisitos);
    }

    public void ejercicio15() {
        Scanner lectorTexto = new Scanner(System.in);
        System.out.println("Ejercicio 15");

        int Entero = 21;
        System.out.println("Entero: " + Entero);
        Entero += 5;
        System.out.println("Incrementar 5 unidades: " + Entero);
        Entero -= 3;
        System.out.println("Decrementar 3 unidades: " + Entero);
        Entero *= 10;
        System.out.println("Multiplicar por 10: " + Entero);
        Entero /= 2;
        System.out.println("Dividir por 2: " + Entero);


    }

}

