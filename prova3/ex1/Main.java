package ex1;

public class Main {
    public static void main(String[] args) {
        Produto notebook = new Produto("Notebook", 10);

        Compras compras = new Compras();
        Vendas vendas = new Vendas();
        Auditoria auditoria = new Auditoria();

        notebook.adicionarArea(compras);
        notebook.adicionarArea(vendas);
        notebook.adicionarArea(auditoria);

        System.out.println("--- Alterando estoque para 8 ---");
        notebook.setQuantidade(8);

        System.out.println("--- Alterando estoque para 8 novamente (sem mudança) ---");
        notebook.setQuantidade(8);

        System.out.println("--- Alterando estoque para 3 ---");
        notebook.setQuantidade(3);

        System.out.println("--- Alterando estoque para 0 ---");
        notebook.setQuantidade(0);

        System.out.println("--- Alterando estoque para 15 ---");
        notebook.setQuantidade(15);

        System.out.println("--- Removendo a área de Compras ---");
        notebook.removerArea(compras);

        System.out.println("--- Alterando estoque para 2 (Compras não deve ser notificada) ---");
        notebook.setQuantidade(2);
    }
}
