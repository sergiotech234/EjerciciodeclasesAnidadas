public class Casa {
    // Atributo privado
    private String direccion;

    // Constructor
    public Casa(String direccion) {
        this.direccion = direccion;
    }

    // Clase interna no estática
    public class Habitacion {
        private String nombre;

        // Constructor
        public Habitacion(String nombre) {
            this.nombre = nombre;
        }

        // Mostrar información
        public void imprimir() {
            System.out.println("Habitacion: " + nombre);
            System.out.println("Direccion de la casa: " + direccion);
        }
    }

    // Clase anidada estática pública
    public static class Constructora {
        private String nombre;

        // Constructor
        public Constructora(String nombre) {
            this.nombre = nombre;
        }

        public void imprimir() {
            System.out.println("Constructora: " + nombre);
        }
    }
}
