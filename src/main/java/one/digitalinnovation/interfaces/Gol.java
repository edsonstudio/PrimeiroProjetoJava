package one.digitalinnovation.interfaces;

public class Gol implements Carro{

    @Override
    public String marca() {
        return "Volkswagen";
    }

    @Override
    public Double valor() {
        return 1.000;
    }
}
