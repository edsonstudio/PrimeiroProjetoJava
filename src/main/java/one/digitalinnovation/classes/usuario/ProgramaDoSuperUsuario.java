package one.digitalinnovation.classes.usuario;

public class ProgramaDoSuperUsuario {

    public static void main(String[] args) {
        final var superUsuario = new SuperUsuario("root", "12341234");

        superUsuario.getLogin();

        superUsuario.getSenha();
        String root = superUsuario.nome;
    }
}
