package entities;

public class Kids extends Menu{
    public double custoBrinquedoSupresa;
    public String nomeBrinquedo;

    public Kids() {
    }

    public Kids(String nomePrato, double valorPrato, double custoBrinquedoSupresa, String nomeBrinquedo) {
        super(nomePrato, valorPrato);
        this.custoBrinquedoSupresa = custoBrinquedoSupresa;
        this.nomeBrinquedo = nomeBrinquedo;
        this.nomePrato= nomePrato;
        this.valorPrato= valorPrato;
    }

    @Override
    public void prepararPrato() {
        System.out.println("O prato: " + this.nomePrato + ", está sendo preparado");
        System.out.println("O Brinquedo: " + this.nomeBrinquedo + "foi separado para o pedido");
    }

    @Override
    public void montarMenu() {
        System.out.println("O menu infantil foi selecionado");
    }

    @Override
    public double obterPreco () {
        double preco;
        preco = valorPrato + custoBrinquedoSupresa;
        System.out.println("O valor final foi: " + preco);
        return preco;
    }
}
