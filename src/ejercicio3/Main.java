package ejercicio3;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ANTES (viola el SRP) ===");
        UsuarioSinSRP usuarioMalo = new UsuarioSinSRP("keli", "1234");
        System.out.println("Datos validos: " + usuarioMalo.validarDatos());
        System.out.println("Autenticado: " + usuarioMalo.autenticar("keli", "1234"));

        System.out.println("\n=== DESPUES (aplicando el SRP) ===");
        Usuario usuario = new Usuario("keli", "1234");
        ValidacionUsuarioService validacionService = new ValidacionUsuarioService();
        AutenticacionService autenticacionService = new AutenticacionService();

        System.out.println("Datos validos: " + validacionService.validarDatos(usuario));
        System.out.println("Autenticado: " + autenticacionService.autenticar(usuario, "keli", "1234"));
        System.out.println("Con clave incorrecta: " + autenticacionService.autenticar(usuario, "keli", "0000"));
    }
}
