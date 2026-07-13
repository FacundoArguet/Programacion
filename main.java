package programacion;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la salud: ");
        int salud = sc.nextInt();

        if (salud <= 0) {
            System.out.println("Estas muerto, LOL");
            sc.close();
            return;
        }

        System.out.print("Ingrese el nivel: ");
        int nv = sc.nextInt();

        if (nv < 0) {
            System.out.println("No puedes ser de nivel tan bajo, burro");
            sc.close();
            return;
        }

        while (nv > 1) {
            System.out.println("Demasiado nivel, vuelva a intentarlo.");
            nv = sc.nextInt();
        }

        Personaje personaje = new Personaje(nombre, salud, nv);

        System.out.println("Nombre: " + personaje.getnombre());
        System.out.println("Salud: " + personaje.getsalud());
        System.out.println("Tu nivel es " + personaje.getnv());

        sc.close();
    }
}