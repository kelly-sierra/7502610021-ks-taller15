package ejercicio3;

// ANTES: viola el SRP porque tiene 3 responsabilidades:
// 1) datos del usuario, 2) autenticacion, 3) validacion.
public class UsuarioSinSRP {
    private String nombre;
    private String contrasena;

    public UsuarioSinSRP(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public boolean autenticar(String nombreIngresado, String contrasenaIngresada) {
        return nombre.equals(nombreIngresado) && contrasena.equals(contrasenaIngresada);
    }

    public boolean validarDatos() {
        return nombre != null && !nombre.isEmpty() && contrasena != null && contrasena.length() >= 4;
    }
}
