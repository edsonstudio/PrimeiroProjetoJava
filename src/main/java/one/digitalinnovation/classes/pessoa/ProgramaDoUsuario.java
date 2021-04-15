package one.digitalinnovation.classes.pessoa;

import one.digitalinnovation.classes.usuario.SuperUsuario;

public class ProgramaDoUsuario {

    public static void main(String[] args) {
        final var batman = new SuperUsuario("batman", "123456");

        batman.getLogin();

        //batman.getSenha();          //ERROR

        //String nomeDoCliente = batman.nome;         //ERROR
    }
}
