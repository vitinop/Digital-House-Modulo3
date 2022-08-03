package entities;

public abstract class Vendedor {

    protected String nome;
    protected int vendas = 0;
    protected int pontosPorVenda;
    private String categoria;


    public void vender(int qtdVendas){
        this.vendas = qtdVendas;
        System.out.println(this.nome + "realizou " + qtdVendas + " vendas.");
    }


    /* Método que calcula os pontos do Vendedor de acordo com seus aspectos a serem condiderados */


    public abstract int calcularPontos();



    public String mostrarCategoriaVendedor(){
        int pontos;
        pontos = calcularPontos();
        System.out.println(this.nome + " tem " + pontos);

        if (pontos < 20){
            System.out.println(this.nome + " é um vendedor categoria novato");
        } else if (pontos > 20 && pontos <30) {
            System.out.println(this.nome + " é um vendedor categoria aprendiz");
        } else if (pontos > 31 && pontos < 49) {
            System.out.println(this.nome + " é um vendedor categoria bom");
        } else if (pontos > 40) {
            System.out.println(this.nome + " é um vendedor categoria mestre");
        }

        return "";
    }


}
