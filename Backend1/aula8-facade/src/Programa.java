import entities.Cartao;
import entities.Produto;
import service.impl.FacadeDesconto;

public class Programa {
    public static void main (String[] args){
        FacadeDesconto facadeDesconto = new FacadeDesconto();
        Cartao cartao = new Cartao("123451","Banco teste");
        Produto produto = new Produto("Molho de tomate","Lata");

        int descontoTotal = facadeDesconto.desconto(cartao,produto,15);

        System.out.println("Desconto concedido: "+descontoTotal+"%.");
    }
}
