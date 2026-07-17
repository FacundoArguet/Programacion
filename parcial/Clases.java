package parcial;
import java.util.Scanner;
public class Clases {

    private String tipo;
    private String arma;
    private int ataque;
    private int vidaMinima;
    private String hechizos;
    private String[] hechizoslist = new String[3];
    private int cantidadHechizos = 0;

    public Clases(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVidaMinima() {
        return vidaMinima;
    }

    public void setVidaMinima(int vidaMinima) {
        this.vidaMinima = vidaMinima;
    }
    public String gethechizo(String hechizos){
        return hechizos;
    }
    public void sethechizos(){
        this.hechizos= hechizos;
    }
    public String getHechizoslist(String hechizoslist){
        return hechizoslist;
    }
    public void setHechizoslist(){
        this.hechizoslist= hechizoslist;
    }
    public void elegirHechizos(Scanner sc) {
        int hech;
    }

    public void mostrarClase() {
        System.out.println("Clase: " + tipo);
        System.out.println("Arma: " + arma);
        System.out.println("Ataque: " + ataque);
        System.out.println("Vida mínima: " + vidaMinima);
        if (tipo.equals("Mago")) {
            System.out.println("Tus hechizos son: " + hechizos);
        }
        else if  (tipo.equals("Guerrero")) {
            System.out.println("Tus mascota es: ");

        }
    }

    public void configuracion() {

        Scanner sc = new Scanner(System.in);
        int opcion;

        switch (tipo) {

            case "Guerrero":

                vidaMinima = 10;

                System.out.println("Elige un arma:");
                System.out.println("1. Espada");
                System.out.println("2. Hacha");
                System.out.println("3. Lanza");

                opcion = sc.nextInt();

                switch (opcion) {

                    case 1:
                        arma = "Espada";
                        ataque = 30;
                        break;

                    case 2:
                        arma = "Hacha";
                        ataque = 40;
                        break;

                    case 3:
                        arma = "Lanza";
                        ataque = 35;
                        break;

                    default:
                        System.out.println("Opción de arma incorrecta.");
                }

                break;

            case "Mago":
                elegirHechizos(sc);
                vidaMinima = 7;

                System.out.println("Elige un arma:");
                System.out.println("1. Baculo");
                System.out.println("2. Libro");
                System.out.println("3. Pergaminos");

                opcion =sc.nextInt();
                    switch(opcion) {
                        case 1:
                            arma="Baculo";
                            ataque=50;
                            break;

                        case 2:
                            arma="libro";
                            ataque=40;
                            break;
                        case 3:
                            arma="pergamino";
                            ataque=30;
                            break;
                    }
            default:
                System.out.println("Clase incorrecta.");
        }
    }
}