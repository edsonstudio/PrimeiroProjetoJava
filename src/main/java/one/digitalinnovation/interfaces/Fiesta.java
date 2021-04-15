package one.digitalinnovation.interfaces;

public class Fiesta implements Carro, Veiculo{
    @Override
    public String marca() {
        return "Ford";
    }

    @Override
    public Double valor() {
        return 5000.50;
    }

    @Override
    public String registro() {
        return "!123ASD123ASD";
    }

    @Override
    public void ligar() {
        Carro.super.ligar();

        Veiculo.super.ligar();
    }
}
