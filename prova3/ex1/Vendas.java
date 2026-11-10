package ex1;

import java.util.HashMap;
import java.util.Map;

public class Vendas implements AreaInteressada {
    private Map<String, Integer> ultimaQuantidade = new HashMap<>();

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        Integer anterior = ultimaQuantidade.get(nomeProduto);
        if (anterior != null && anterior == 0 && novaQuantidade > 0) {
            System.out.println("[Vendas] ALERTA: " + nomeProduto + " voltou a ter estoque (" + novaQuantidade + " unidades)!");
        }
        ultimaQuantidade.put(nomeProduto, novaQuantidade);
    }
}
