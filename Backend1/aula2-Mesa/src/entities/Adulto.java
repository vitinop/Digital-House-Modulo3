package entities;

public class Adulto extends Menu{

    public Adulto() {
    }

    public Adulto(String nomePrato, double valorPrato) {
        super(nomePrato, valorPrato);
        this.nomePrato= nomePrato;
        this.valorPrato= valorPrato;
    }

    @Override
    public void prepararPrato() {
        System.out.println("O prato: " + this.nomePrato + ", está sendo preparado");
    }

    @Override
    public void montarMenu() {
        System.out.println("O menu adulto foi selecionado");
    }

    @Override
    public double obterPreco() {
        double preco;
        preco = valorPrato;
        System.out.println("O valor final foi: " + preco);
        return preco;
    }

}
