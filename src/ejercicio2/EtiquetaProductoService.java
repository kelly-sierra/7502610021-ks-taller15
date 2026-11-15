package ejercicio2;

// Responsabilidad unica: generar etiquetas del producto
public class EtiquetaProductoService {
    public void generarEtiqueta(Producto producto) {
        System.out.println("Etiqueta -> Producto: " + producto.getNombre() + " | Precio: $" + producto.getPrecio());
    }
}
