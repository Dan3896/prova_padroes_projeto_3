package ex2;

public class Rotativo implements PerfilCobranca {
    public static final double VALOR_POR_HORA = 10.0;

    @Override
    public double calcular(int minutos) {
        int horasIniciadas = (int) Math.ceil(minutos / 60.0);
        return horasIniciadas * VALOR_POR_HORA;
    }

    @Override
    public String getNome() {
        return "Rotativo";
    }
}
