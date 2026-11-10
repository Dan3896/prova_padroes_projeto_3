package ex1;

public class Compras implements AreaInteressada {
    private static final int ESTOQUE_MINIMO = 5;

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        if (novaQuantidade < ESTOQUE_MINIMO) {
            System.out.println("[Compras] ALERTA: estoque de " + nomeProduto + " baixo (" + novaQuantidade + " unidades). Repor estoque!");
        }
    }
}
