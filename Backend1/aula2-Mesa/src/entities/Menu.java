package entities;

public abstract class Menu {
    public String nome_prato;
    public String valor_prato;

    public Menu() {
    }

    public Menu(String nome_prato, String valor_prato) {
        this.nome_prato = nome_prato;
        this.valor_prato = valor_prato;
    }
}
