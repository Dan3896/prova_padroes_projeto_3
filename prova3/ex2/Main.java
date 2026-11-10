package ex2;

public class Main {
    public static void main(String[] args) {
        int minutos = 150;

        System.out.println("--- Mesmo tempo de permanência nos três perfis ---");
        new Tiquete("ABC-1234", minutos, new Rotativo()).exibir();
        new Tiquete("DEF-5678", minutos, new Mensalista()).exibir();
        new Tiquete("GHI-9012", minutos, new Conveniado()).exibir();

        System.out.println("--- Troca de perfil em um mesmo tíquete ---");
        Tiquete tiquete = new Tiquete("XYZ-0001", minutos, new Rotativo());
        tiquete.exibir();

        tiquete.setPerfil(new Conveniado());
        tiquete.exibir();

        tiquete.setPerfil(new Mensalista());
        tiquete.exibir();
    }
}
