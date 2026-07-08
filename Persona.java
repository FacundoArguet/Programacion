package programacion;

import java.util.ArrayList;

public class Persona {

    private Cabeza cabeza;
    private Torax torax;

    private Ropa ropa;

    private ArrayList<TarjetaCredito> tarjetas;

    public Persona(Ropa ropa) {
        this.ropa = ropa;


        cabeza = new Cabeza();
        torax = new Torax();


        tarjetas = new ArrayList<>();
    }

    public void agregarTarjeta(TarjetaCredito tarjeta) {
        tarjetas.add(tarjeta);
    }

    public void mostrarTarjetas() {
        System.out.println("Cantidad de tarjetas: " + tarjetas.size());

        for (TarjetaCredito tarjeta : tarjetas) {
            System.out.println("- " + tarjeta.getNumero());
        }
    }

    public void mostrarInformacion() {
        System.out.println("La persona usa una " + ropa.getTipo());
    }
}