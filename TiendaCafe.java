public class TiendaCafe {
    public static void main(String[] args) {
        // Crear objetos Cafe
       
        Cafe cafe1 = new Cafe("Café de Nariño", "Nariño", 38000.0, 5.0f);
        Cafe cafe2 = new Cafe("Café de Antioquia", "Antioquia", 36000.0, 3.5f);
        Cafe cafe3 = new Cafe("Café del Huila", "Huila", 39000.0, 4.0f);

        // Mostrar información
        cafe1.mostrarInformacion();
        cafe2.mostrarInformacion();
        cafe3.mostrarInformacion();

        // Calcular y mostrar precio total
        System.out.println("Precio total del café de Nariño: $" + cafe1.calcularPrecioTotal() + " COP");
        System.out.println("Precio total del café de Antioquia: $" + cafe2.calcularPrecioTotal() + " COP");
        System.out.println("Precio total del café del Huila: $" + cafe3.calcularPrecioTotal() + " COP");
        System.out.println("------------------------------------");

        // Actualizar cantidad del café de Nariño
        cafe1.actualizarCantidad(6.5f);
        System.out.println("Información actualizada del café de Nariño:");
        cafe1.mostrarInformacion();
    }
}
