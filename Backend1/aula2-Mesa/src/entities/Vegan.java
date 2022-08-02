package entities;

public class Vegan extends Menu{
    public float valorEmbalagem;
    public float valorDosCondimentos;

    public Vegan(float valorEmbalagem, float valorDosCondimentos) {
        this.valorEmbalagem = valorEmbalagem;
        this.valorDosCondimentos = valorDosCondimentos;
    }

    public Vegan(String nome_prato, String valor_prato, float valorEmbalagem, float valorDosCondimentos) {
        super(nome_prato, valor_prato);
        this.valorEmbalagem = valorEmbalagem;
        this.valorDosCondimentos = valorDosCondimentos;
    }
}
