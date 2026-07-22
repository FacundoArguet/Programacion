package parcial;

import java.util.Random;
import java.util.Scanner;

public class Clases {

    private String tipo;
    private String arma;
    private double ataque;
    private int vidaMinima;

    private String[] hechizoslist = new String[3];

    // Exclusivo del Guerrero
    private String mascota;

    // Exclusivos del Mago
    private inventario inventario;
    private objMagic objetoMagico;

    public Clases(String tipo) {

        this.tipo = tipo;

        if (tipo.equals("Guerrero")) {

            mascota = "Lobo";

        } else if (tipo.equals("Mago")) {

                inventario = new inventario(3);

                inventario.agregarItem("Poción de maná");
                inventario.agregarItem("Mapa");


        }
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

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public int getVidaMinima() {
        return vidaMinima;
    }

    public void setVidaMinima(int vidaMinima) {
        this.vidaMinima = vidaMinima;
    }

    public String[] getHechizoslist() {
        return hechizoslist;
    }

    public void setHechizoslist(String[] hechizoslist) {
        this.hechizoslist = hechizoslist;
    }

    public String getMascota() {
        return mascota;
    }

    public inventario getInventario() {
        return inventario;
    }

    public objMagic getObjetoMagico() {
        return objetoMagico;
    }

    public void elegirHechizos(Scanner sc) {

        System.out.println("Elige 3 hechizos:");

        System.out.println("1. Bola de fuego");
        System.out.println("2. Rayo");
        System.out.println("3. Viento cortante");
        System.out.println("4. Estaca gelida");
        System.out.println("5. EXPLOSION MASIVA");

        for (int i = 0; i < 3; i++) {

            System.out.print("Elige el hechizo " + (i + 1) + ": ");
            int hech = sc.nextInt();

            switch (hech) {

                case 1:
                    hechizoslist[i] = "Bola de fuego";
                    ataque = 50;
                    break;

                case 2:
                    hechizoslist[i] = "Rayo";
                    ataque = 45;
                    break;

                case 3:
                    hechizoslist[i] = "Viento Cortante";
                    ataque = 30;
                    break;

                case 4:
                    hechizoslist[i] = "Estaca gelida";
                    ataque = 35;
                    break;

                case 5:
                    hechizoslist[i] = "EXPLOSION MASIVA";
                    ataque = 150;
                    break;

                default:
                    System.out.println("Hechizo incorrecto.");
                    i--;
                    break;
            }
        }
    }
    public void elegirObjetoMagico(Scanner sc) {

        System.out.println("\nElige tu objeto mágico:");

        System.out.println("1. Báculo de fuego");
        System.out.println("2. Libro de hechizos");
        System.out.println("3. Cristal mágico");

        int opcion = sc.nextInt();

        switch (opcion) {

            case 1:

                objetoMagico = new objMagic(
                        "Báculo de fuego",
                        "Báculo",
                        100,
                        100
                );

                inventario.agregarItem("Báculo de fuego");

                break;

            case 2:

                objetoMagico = new objMagic(
                        "Libro de hechizos",
                        "Libro",
                        80,
                        100
                );

                inventario.agregarItem("Libro de hechizos");

                break;

            case 3:

                objetoMagico = new objMagic(
                        "Cristal mágico",
                        "Cristal",
                        120,
                        100
                );

                inventario.agregarItem("Cristal mágico");

                break;

            default:

                System.out.println(
                        "Opción incorrecta."
                );

                elegirObjetoMagico(sc);
        }
    }

    public void mostrarClase() {

        System.out.println("Clase: " + tipo);
        System.out.println("Arma: " + arma);
        System.out.println("Ataque: " + ataque);
        System.out.println("Vida mínima: " + vidaMinima);

        if (tipo.equals("Mago")) {

            System.out.println("\nTus hechizos son:");

            for (int i = 0; i < hechizoslist.length; i++) {
                System.out.println("- " + hechizoslist[i]);
            }

            System.out.println("\nInventario del Mago:");

            String[] objetos = inventario.consultarInventario();

            if (objetos.length == 0) {
                System.out.println("El inventario está vacío.");
            } else {
                for (String objeto : objetos) {
                    System.out.println("- " + objeto);
                }
            }



        } else if (tipo.equals("Guerrero")) {

            System.out.println("Tu mascota es: " + mascota);
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
                        break;
                }

                break;

            case "Mago":

                elegirHechizos(sc);

                vidaMinima = 7;

                System.out.println("Elige un arma:");
                System.out.println("1. Báculo");
                System.out.println("2. Libro");
                System.out.println("3. Pergaminos");

                opcion = sc.nextInt();

                switch (opcion) {

                    case 1:
                        arma = "Báculo";
                        ataque = ataque * 2.5;
                        break;

                    case 2:
                        arma = "Libro";
                        ataque = ataque * 2;
                        break;

                    case 3:
                        arma = "Pergaminos";
                        ataque = ataque * 1.5;
                        break;

                    default:
                        System.out.println("Opción de arma incorrecta.");
                        break;
                }

                break;

            default:

                System.out.println("Clase incorrecta.");
                break;
        }
    }

    public void atacar() {

        if (tipo.equals("Guerrero")) {

            System.out.println(
                    "El Guerrero ataca con su "
                            + arma
                            + " y causa "
                            + ataque
                            + " de daño."
            );

        } else if (tipo.equals("Mago")) {

            Random random = new Random();

            int numeroAleatorio =
                    random.nextInt(hechizoslist.length);

            System.out.println(
                    "El Mago lanza "
                            + hechizoslist[numeroAleatorio]
                            + " y causa "
                            + ataque
                            + " de daño."
            );
        }
    }

    public void usarObjetoMagico() {

        if (tipo.equals("Mago")) {
            objetoMagico.usar();
        }
    }
}