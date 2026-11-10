package ex2;

public class Tiquete {
    private String placa;
    private int minutos;
    private PerfilCobranca perfil;

    public Tiquete(String placa, int minutos, PerfilCobranca perfil) {
        this.placa = placa;
        this.minutos = minutos;
        this.perfil = perfil;
    }

    public void setPerfil(PerfilCobranca perfil) {
        this.perfil = perfil;
    }

    public double calcularValor() {
        return perfil.calcular(minutos);
    }

    public void exibir() {
        System.out.printf("Placa: %s | Tempo: %d min | Perfil: %s | Valor: R$ %.2f%n",
                placa, minutos, perfil.getNome(), calcularValor());
    }
}
