package parcial;
import java.util.Scanner;

public class main_personaje {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== CREACIÓN DEL PERSONAJE ===");

        System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();

        int nivel;

        do {
            System.out.print("Ingrese el nivel (0-100): ");
            nivel = sc.nextInt();

            if (nivel < 0) {
                System.out.println("Estás muerto.");
            } else if (nivel > 4) {
                System.out.println("No puedes ser de un nivel tan alto.");
            }

        } while (nivel < 0 || nivel > 4);

        System.out.println("\nSeleccione una clase:");
        System.out.println("1. Guerrero");
        System.out.println("2. Mago");

        int opcionClase;
        Clases claseElegida = null;


        do {
            System.out.print("Ingrese una opción: ");
            opcionClase = sc.nextInt();

            switch (opcionClase) {

                case 1:
                    claseElegida = new Clases("Guerrero");
                    break;

                case 2:
                    claseElegida = new Clases("Mago");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }

        } while (opcionClase < 1 || opcionClase > 2);

        // Configura arma, ataque y vida mínima
        claseElegida.configuracion();

        int salud;

        do {

            if (claseElegida.getTipo().equals("Mago")) {
                System.out.println("Seleccione sus hechizos");
                claseElegida.elegirHechizos(sc);
            }

            System.out.print(
                    "Ingrese la salud. La vida mínima para "
                            + claseElegida.getTipo()
                            + " es "
                            + claseElegida.getVidaMinima()
                            + ": "
            );

            salud = sc.nextInt();

            if (salud < claseElegida.getVidaMinima()) {
                System.out.println(
                        "La salud no puede ser menor que "
                                + claseElegida.getVidaMinima()
                                + "."
                );
            }

        } while (salud < claseElegida.getVidaMinima());

        Personaje personaje = new Personaje(
                nombre,
                salud,
                nivel,
                claseElegida
        );

        personaje.mostrarDatos();

        System.out.println();

        personaje.atacar();

        sc.close();
    }
}