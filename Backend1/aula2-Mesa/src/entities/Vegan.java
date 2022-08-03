package entities;

public class Vegan extends Menu{
    public double valorEmbalagem;
    public double valorCondimento;

    public Vegan() {

    }

    public Vegan(String nomePrato, double valorPrato, double valorEmbalagem, double valorCondimento) {
        super(nomePrato, valorPrato);
        this.valorEmbalagem = valorEmbalagem;
        this.valorCondimento = valorCondimento;
        this.nomePrato= nomePrato;
        this.valorPrato= valorPrato;
    }


    @Override
    public void prepararPrato() {
        System.out.println("O prato: " + this.nomePrato + ", está sendo preparado");
    }


    @Override
    public void montarMenu() {
        System.out.println("O menu vegano foi selecionado");
    }

    @Override
    public double obterPreco () {
        double preco;
        preco = valorPrato + valorEmbalagem + (valorCondimento * 0.01);
        System.out.println("O valor final foi: " + preco);
        return (preco);
    }
}
