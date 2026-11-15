package ejercicio1;

// ANTES: viola el SRP porque tiene 3 responsabilidades:
// 1) manejar la informacion del libro, 2) generar reportes, 3) persistencia.
public class LibroSinSRP {
    private String titulo;
    private String autor;
    private String isbn;

    public LibroSinSRP(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void generarReporte() {
        System.out.println("Reporte del libro: " + titulo + " - " + autor + " (ISBN: " + isbn + ")");
    }

    public void guardarEnBaseDeDatos() {
        System.out.println("Guardando el libro '" + titulo + "' en la base de datos...");
    }
}
