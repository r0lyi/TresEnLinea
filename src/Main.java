import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            menu();

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    novaPartida();
                    break;
                case 2:
                    cargarPartida();
                    break;
                case 3:
                    config();
                    break;
                case 4:
                    calcular();
                    break;
                case 5:
                    salir();
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 5);

        System.out.println("¡Gracias por jugar!");

    }

    private static void salir() {
        System.out.println("Has elegido: Salir");
    }

    private static void config() {
        System.out.println("Has elegido: Configuración");
    }

    private static void cargarPartida() {
        System.out.println("Has elegido: Carga partida");
    }

    private static void novaPartida() {
        System.out.println("Has elegido: Nueva partida");
    }

    private static void menu() {
        System.out.println("MENÚ PRINCIPAL");
        System.out.println("=================");
        System.out.println("(1)Nueva partida (2)Cargar partida (3)Configuración (4)Salir");
        System.out.print("Introduzca una opción: ");
    }
    private static void calcular() {
        System.out.println("Estas en una calcualdora");

    }

}