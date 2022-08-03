package entities;

public abstract class Menu {
    //atributos
    public String nomePrato;
    public double valorPrato;

    //construtor padrao
    public Menu() {
    }

    //construtor com sobrescrita
    public Menu(String nomePrato, double valorPrato) {
        this.nomePrato = nomePrato;
        this.valorPrato = valorPrato;
    }

    //métodos costumizados
    public abstract void prepararPrato();
    public abstract void montarMenu();
    public abstract double obterPreco();


}
