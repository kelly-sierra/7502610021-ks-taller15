package ejercicio2;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ANTES (viola el SRP) ===");
        ProductoSinSRP productoMalo = new ProductoSinSRP("Laptop", 2000000);
        productoMalo.generarEtiqueta();
        System.out.println("Precio con IVA: $" + productoMalo.calcularPrecioConIva());

        System.out.println("\n=== DESPUES (aplicando el SRP) ===");
        Producto producto = new Producto("Laptop", 2000000);
        EtiquetaProductoService etiquetaService = new EtiquetaProductoService();
        PrecioProductoService precioService = new PrecioProductoService();

        etiquetaService.generarEtiqueta(producto);
        System.out.println("Precio con IVA: $" + precioService.calcularPrecioConIva(producto));
    }
}
