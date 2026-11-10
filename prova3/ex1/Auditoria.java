package ex1;

import java.util.ArrayList;
import java.util.List;

public class Auditoria implements AreaInteressada {
    private List<String> registros = new ArrayList<>();

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        String registro = "Produto: " + nomeProduto + " | Nova quantidade: " + novaQuantidade;
        registros.add(registro);
        System.out.println("[Auditoria] Registro #" + registros.size() + " -> " + registro);
    }

    public List<String> getRegistros() {
        return registros;
    }
}
