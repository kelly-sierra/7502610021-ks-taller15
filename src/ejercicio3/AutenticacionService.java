package ejercicio3;

// Responsabilidad unica: autenticar usuarios
public class AutenticacionService {
    public boolean autenticar(Usuario usuario, String nombreIngresado, String contrasenaIngresada) {
        return usuario.getNombre().equals(nombreIngresado)
                && usuario.getContrasena().equals(contrasenaIngresada);
    }
}
