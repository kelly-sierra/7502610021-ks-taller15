package ejercicio3;

// Responsabilidad unica: validar los datos del usuario
public class ValidacionUsuarioService {
    public boolean validarDatos(Usuario usuario) {
        return usuario.getNombre() != null && !usuario.getNombre().isEmpty()
                && usuario.getContrasena() != null && usuario.getContrasena().length() >= 4;
    }
}
