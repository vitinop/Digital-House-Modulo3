package service.impl;

import entities.Produto;

public class ApiProduto {

    public int desconto(Produto produto){

        String prod = produto.getTipo();
        if (prod.equalsIgnoreCase("Lata")){
            return 10;
        } else {
            return 0;
        }
    }
}
