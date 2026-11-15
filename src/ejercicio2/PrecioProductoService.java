package ejercicio2;

// Responsabilidad unica: calcular precios del producto
public class PrecioProductoService {
    private static final double IVA = 0.19;

    public double calcularPrecioConIva(Producto producto) {
        return producto.getPrecio() * (1 + IVA);
    }
}
