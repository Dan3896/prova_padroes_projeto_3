package ex3;

public class Main {
    public static void main(String[] args) {
        Bebida pedido1 = new Leite(new Espresso());

        Bebida pedido2 = new Calda(new Chantilly(new Leite(new Cha())));

        Bebida pedido3 = new Chantilly(new Leite(new Leite(new Espresso())));

        imprimir(pedido1);
        imprimir(pedido2);
        imprimir(pedido3);
    }

    private static void imprimir(Bebida pedido) {
        System.out.printf("%s | Total: R$ %.2f%n", pedido.getDescricao(), pedido.getPreco());
    }
}
