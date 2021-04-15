package one.digitalinnovation.interfaces;

//No Java para herdar usa-se o "extends" e para implementar uma ou varias interfaces usa-se "implements" .

public interface Carro extends Automovel{
    String marca();

    Double valor();

    default void ligar() { System.out.println("Ligando o carro!" ); }

    default String codigoRenavan(){
        return "65454qweqw";
    }
}
