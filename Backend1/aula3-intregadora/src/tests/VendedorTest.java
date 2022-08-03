package tests;

import entities.Afiliado;
import entities.Estagiario;
import entities.Funcionario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VendedorTest {

    Funcionario funcionario1,afiliado1,estagiario1;


    @BeforeEach
    void doBefore(){
        funcionario1 = new Funcionario("jessica",3);
        afiliado1 = new Afiliado("José");
        estagiario1 = new Estagiario("Victor");
    }

    @Test
    void tests(){
        funcionario1.mostrarCategoriaVendedor();
    }
}




