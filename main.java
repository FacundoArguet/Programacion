package programacion.Redes;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la red (Ej: 192.168.1.): ");
        String red = sc.nextLine();

        System.out.println("Analizando...");
        escaneo escaneo = new escaneo();
        escaneo.escanear(red);

        sc.close();
    }
}