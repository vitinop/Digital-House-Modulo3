package entities;

public class Kids extends Menu{
    public int qntBrinquedoSupresa;

    public Kids(int qntBrinquedoSupresa) {
        this.qntBrinquedoSupresa = qntBrinquedoSupresa;
    }

    public Kids(String nome_prato, String valor_prato, int qntBrinquedoSupresa) {
        super(nome_prato, valor_prato);
        this.qntBrinquedoSupresa = qntBrinquedoSupresa;
    }
}
