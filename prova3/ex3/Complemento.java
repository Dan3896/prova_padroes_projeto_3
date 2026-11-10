package ex3;

public abstract class Complemento implements Bebida {
    protected Bebida bebida;

    public Complemento(Bebida bebida) {
        this.bebida = bebida;
    }

    protected abstract String getNome();

    protected abstract double getValor();

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", " + getNome();
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + getValor();
    }
}
