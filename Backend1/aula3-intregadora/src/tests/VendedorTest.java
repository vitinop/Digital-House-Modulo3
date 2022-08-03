package tests;
import entities.Funcionario;
import entities.Vendedor;
import entities.Afiliado;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class VendedorTest {

    Vendedor vendedor1, vendedor2;

    @BeforeEach
    void doBefore(){
        vendedor1 = new Funcionario("Victor",2);
        vendedor2 = new Funcionario("Junior", 15);
    }

    @Test
    void test(){
        vendedor1.mostrarCategoria();
        vendedor2.mostrarCategoria();
    }

}