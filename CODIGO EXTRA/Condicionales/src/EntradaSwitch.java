public class EntradaSwitch {
    public static void main(String[] args) {
        int numero = 4;
        switch (numero) {
            case 1:
                //cuerpo del caso
                System.out.println("Ejecutando en caso 1");
                break;
            case 2:
                //cuerpo del caso
                System.out.println("Ejecutando en caso 2");

                break;
            case 3:
                //cuerpo del caso
                System.out.println("Ejecutando en caso 3");

                break;
            case 4:
                //cuerpo del caso
                System.out.println("Ejecutando en caso 4");

                break;
            default:
                //cuerpo del restante
                System.out.println("Ejecutando en caso por defecto");

                break;
        }

        char letra='A';
        switch (letra){
            case 'A':
                System.out.println("Seleccionada letra A");
                break;
            case 'B':
                System.out.println("Seleccionada letra B");

                break;
            case 'C':
                System.out.println("Seleccionada letra C");

                break;
            default:
                System.out.println("Seleccionanda otra letra");
        }

        String nombre="Christopher";
        switch (nombre.toLowerCase()){
            case "christopher" ->{
                System.out.println("El nombbre es Christopher");
            }
            case "Maria" ->{
                System.out.println("El nombbre es Maria");
            }
            case "Luis" ->{
                System.out.println("El nombbre es Luis");
            }
            case "Marta" ->{
                System.out.println("El nombbre es Marta");
            }
            default -> {
                System.out.println("El nombre no reconocido");
            }
        }
        System.out.println("Terminando el programa");
    }
}

