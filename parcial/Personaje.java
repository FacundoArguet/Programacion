package parcial;

public class Personaje {

    private String nombre;
    private int salud;
    private int nivel;
    private Clases clase;

    public Personaje(
            String nombre,
            int salud,
            int nivel,
            Clases clase
    ) {

        this.nombre = nombre;
        this.salud = salud;
        this.nivel = nivel;
        this.clase = clase;
    }

    public void atacar() {

        clase.atacar();
    }

    public void mostrarDatos() {

        System.out.println(
                "\n--- DATOS DEL PERSONAJE ---"
        );

        System.out.println(
                "Nombre: "
                        + nombre
        );

        System.out.println(
                "Salud: "
                        + salud
        );

        System.out.println(
                "Nivel: "
                        + nivel
        );

        clase.mostrarClase();
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public int getSalud() {

        return salud;
    }

    public void setSalud(int salud) {

        this.salud = salud;
    }

    public int getNivel() {

        return nivel;
    }

    public void setNivel(int nivel) {

        this.nivel = nivel;
    }

    public Clases getClase() {

        return clase;
    }

    public void setClase(Clases clase) {

        this.clase = clase;
    }
}