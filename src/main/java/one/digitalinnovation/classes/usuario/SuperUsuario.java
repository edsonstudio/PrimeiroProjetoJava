package one.digitalinnovation.classes.usuario;

public class SuperUsuario {
    private String login;
    private String senha;
    String nome;

    //Construtor normal
    public SuperUsuario(final String login, final String senha) {
        this.login = login;
        this.senha = senha;
    }

    //Equivalentes ao {get;set;} do C#
    public String getLogin() {return login;}

    protected String getSenha() {return senha;}
}
