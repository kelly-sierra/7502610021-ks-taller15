package ejercicio1;

// Responsabilidad unica: persistencia del libro
public class LibroRepository {
    public void guardar(Libro libro) {
        System.out.println("Guardando el libro '" + libro.getTitulo() + "' en la base de datos...");
    }
}
