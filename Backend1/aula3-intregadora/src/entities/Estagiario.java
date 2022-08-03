package entities;


public class Estagiario extends Vendedor{

    public Estagiario(String nome) {
        super.nome = nome;
        super.pontosPorVenda = 5;
    }
    @Override

    public int calcularPontos() {
        int pontos;
        pontos = calcularPontos();
        if (pontos < 50){
            System.out.println(this.nome + " é um vendedor categoria estagiário  novato");
        } else if (pontos >= 50) {
            System.out.println(this.nome + " é um vendedor categoria  estagiário experiente");
        }
        return this.vendas * pontosPorVenda;
    }
}


