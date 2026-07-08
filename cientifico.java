package programacion;
public class cientifico extends Persona {

    private String especialidad;

    public cientifico(Ropa ropa, String especialidad) {
        super(ropa);
        this.especialidad = especialidad;
    }

    public void investigar() {
        System.out.println("El científico investiga en " + especialidad);
    }
}