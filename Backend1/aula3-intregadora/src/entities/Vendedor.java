package entities;

public abstract class Vendedor {

    protected String nome;
    protected int vendas = 0;
    protected int pontosPorVenda;

    // Métodos
    public void vender(int qtdeVendas) {
        this.vendas = qtdeVendas;
        System.out.println(this.nome + " realizou " + qtdeVendas + " vendas.");
    }

    /* Método que calcula os pontos do Vendedor de acordo com seus aspectos a serem considerados*/

    public abstract int calcularPontos();

    public String mostrarCategoria() {
        int pontosVendedor = calcularPontos();
        return this.nome + "  tem um total de " + pontosVendedor + " pontos, e  sua categoria é: " + getCategoria(pontosVendedor);
    }
    public String getCategoria(int pontosVendedor) {
        if ( pontosVendedor > 40) {
            return "Mestre";
        }
        else if (pontosVendedor>30 && pontosVendedor<40 ){
            return "Bom";
        }
        else if (pontosVendedor>=20 && pontosVendedor<=30 ) {
            return "Aprendiz";
        }
        else if (pontosVendedor<20) {
            return "Novato";
        }
        return null;
    }
}