public class Main {
    public static void main(String[] args) {
menu();

    }
    public static void menu(){
        String opcion ="";
        switch (opcion){
            case "Nueva Partida":
                System.out.println("Estas en una partida");
                break;
            case "Cargar Partida":
                System.out.println("Estas cargando la partida");
                break;
            case "Configuración":
                System.out.println("Estas en configuración");
                break;
            case "salir":
                System.out.println("Estas saliendo de la partida ");
        }

    }
}