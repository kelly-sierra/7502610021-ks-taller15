package ejercicio1;

// Responsabilidad unica: generar reportes del libro
public class ReporteLibroService {
    public void generarReporte(Libro libro) {
        System.out.println("Reporte del libro: " + libro.getTitulo() + " - " + libro.getAutor()
                + " (ISBN: " + libro.getIsbn() + ")");
    }
}
