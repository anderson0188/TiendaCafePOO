public class Cafe {
    private String nombre;
    private String region;
    private double precioPorKilo;
    private float cantidadEnKilos;

    // Constructor
    public Cafe(String nombre, String region, double precioPorKilo, float cantidadEnKilos) {
        this.nombre = nombre;
        this.region = region;
        this.precioPorKilo = precioPorKilo;
        this.cantidadEnKilos = cantidadEnKilos;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Región: " + region);
        System.out.println("Precio por kilo: $" + precioPorKilo + " COP");
        System.out.println("Cantidad disponible: " + cantidadEnKilos + " kg");
        System.out.println("-------------------------------");
    }

    public double calcularPrecioTotal() {
        return precioPorKilo * cantidadEnKilos;
    }

    public void actualizarCantidad(float nuevaCantidad) {
        this.cantidadEnKilos = nuevaCantidad;
    }

    public void aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 100) {
            this.precioPorKilo -= this.precioPorKilo * (porcentaje / 100);
        }
    }
}
