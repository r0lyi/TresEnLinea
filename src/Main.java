import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("MENÚ PRINCIPAL");
            System.out.println("=================");
            System.out.println("(1)Nueva partida (2)Cargar partida (3)Configuración (4)Salir");
            System.out.print("Introduzca una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has elegido: Nueva partida");
                    break;
                case 2:
                    System.out.println("Has elegido: Carga partida");
                    break;
                case 3:
                    System.out.println("Has elegido: Configuración");
                    break;
                case 4:
                    System.out.println("Has elegido: Salir");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 4);

        System.out.println("¡Gracias por jugar!");

    }
}