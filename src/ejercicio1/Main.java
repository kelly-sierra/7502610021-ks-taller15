package ejercicio1;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ANTES (viola el SRP) ===");
        LibroSinSRP libroMalo = new LibroSinSRP("Cien anios de soledad", "Gabriel Garcia Marquez", "978-0307474728");
        libroMalo.generarReporte();
        libroMalo.guardarEnBaseDeDatos();

        System.out.println("\n=== DESPUES (aplicando el SRP) ===");
        Libro libro = new Libro("Cien anios de soledad", "Gabriel Garcia Marquez", "978-0307474728");
        ReporteLibroService reporteService = new ReporteLibroService();
        LibroRepository repository = new LibroRepository();

        reporteService.generarReporte(libro);
        repository.guardar(libro);
    }
}
