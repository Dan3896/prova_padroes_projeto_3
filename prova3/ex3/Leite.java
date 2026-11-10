package ex3;

public class Leite extends Complemento {
    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    protected String getNome() {
        return "Leite";
    }

    @Override
    protected double getValor() {
        return 1.50;
    }
}
