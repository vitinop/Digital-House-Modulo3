package entities;

public class GerenciadorSpam extends Gerenciador{

    @Override
    public void verificar(Mail email) {
        System.out.println("Cuidado!  S P A M !!!!!  E-mail enviado para Lixeira");
    }
}

