import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       menu(sc);
    }
    public static void menu(Scanner sc){
        int opcion;

        do {
            System.out.println("MENÚ PRINCIPAL");
            System.out.println("=================");
            System.out.println("(1)Nueva partida (2)Carga partida (3)Configuración (4)Salir");
            System.out.println("=================");
            System.out.print("Introduzca una opción: ");

           opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("HAS ELEGIDO: NUEVA PARTIDA");
                    break;
                case 2:
                    System.out.println("HAS ELEGIDO: CARGA PARTIDA");
                    break;
                case 3:
                    System.out.println("HAS ELEGIDO: CONFIGURACIÓN");
                    break;
                case 4:
                    System.out.println("HAS ELEGIDO: SALIR");
                    break;
                default:
                    System.out.println("OPCION NO VALIDA , INTANTALO OTRA VEZ");
            }
        } while (opcion != 4);

        System.out.println("¡TE FUISTE DEL JUEGO!");

    }
}