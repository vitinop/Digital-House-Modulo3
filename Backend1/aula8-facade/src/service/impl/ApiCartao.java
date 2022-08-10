package service.impl;

import entities.Cartao;

public class ApiCartao {

    public int desconto(Cartao cartao){
        String banco = cartao.getBanco();
        if (banco.equalsIgnoreCase("Star Bank")){
            return 20;
        } else {
            return 0;
        }
    }
}
