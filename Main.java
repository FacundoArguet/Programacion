package programacion;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int cant;
        String nombpro, despro, codpro, origpro;
        double precpro, pesopro;
        
        System.out.println("Cuantos articulos desea?");
        cant = sc.nextInt();
        sc.nextLine();
        
        Articulos[] artilist = new Articulos[cant];
        
        for (int i = 0; i < cant; i++) {
            System.out.println("Nombre del producto: ");
            nombpro = sc.nextLine();
            sc.nextLine();
            System.out.println("descrpcion del producto: ");
            despro = sc.nextLine();
            System.out.println("codigo del producto: ");
            codpro = sc.nextLine();
            System.out.println("Origen del producto: ");
            origpro = sc.nextLine();
            System.out.println("precio del producto: ");
            precpro = sc.nextDouble();
            sc.nextLine();
            System.out.println("peso del producto: ");
            pesopro = sc.nextDouble();
            sc.nextLine();

        }
    }
}
