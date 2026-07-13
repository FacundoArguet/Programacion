package programacion;

public class escaneo {

    public void escanear(String red) {

        for (int i = 1; i <= 254; i++) {

            String ip = red + i;

            try {

                ProcessBuilder pb = new ProcessBuilder(
                        "ping",
                        "-c", "1",     // Enviar 1 paquete
                        "-W", "1",     // Esperar 1 segundo
                        ip
                );

                Process proceso = pb.start();

                int resultado = proceso.waitFor();

                if (resultado == 0) {
                    System.out.println(ip + " está activa");
                }

            } catch (Exception e) {
                System.out.println("Error al comprobar " + ip);
            }
        }
    }
}