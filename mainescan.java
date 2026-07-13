package programacion;
import java.util.Scanner;

public class mainescan {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la red (Ej: 192.168.1.): ");
        String red = sc.nextLine();

        System.out.println("Analizando...");
        escaneore escaneo = new escaneore();
        escaneo.escanear(red);

        sc.close();
    }
}