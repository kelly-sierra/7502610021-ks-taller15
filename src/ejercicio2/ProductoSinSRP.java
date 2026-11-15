package ejercicio2;

// ANTES: viola el SRP porque tiene 3 responsabilidades:
// 1) datos del producto, 2) generacion de etiquetas, 3) calculo de precios.
public class ProductoSinSRP {
    private String nombre;
    private double precio;

    public ProductoSinSRP(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void generarEtiqueta() {
        System.out.println("Etiqueta -> Producto: " + nombre + " | Precio: $" + precio);
    }

    public double calcularPrecioConIva() {
        return precio * 1.19;
    }
}
