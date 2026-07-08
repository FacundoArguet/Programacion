package programacion;

    public class Maineje {

        public static void main(String[] args) {

            Ropa ropa = new Ropa("Bata blanca");


            cientifico cientifico = new cientifico(ropa, "Biología");


            cientifico.agregarTarjeta(new TarjetaCredito("1111-2222-3333"));
            cientifico.agregarTarjeta(new TarjetaCredito("4444-5555-6666"));

            cientifico.mostrarInformacion();
            cientifico.mostrarTarjetas();
            cientifico.investigar();
        }
    }

