package test;

import entities.Adulto;
import entities.Kids;
import entities.Vegan;
import entities.Menu;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MenuTest {

    Menu adultoObj, kidsObj, veganObj;

    @BeforeEach
    void doBefore() {
        adultoObj = new Adulto("Bobó de camarão",56.90);
        kidsObj = new Kids ("Batatas Felizes",35.50,11.99, "Bataman kid");
        veganObj = new Vegan ("Salada Vegana", 21.99, 10.99,5);
    }

    @Test
    void tests() {
        adultoObj.montarMenu();
        adultoObj.prepararPrato();
        adultoObj.obterPreco();

        kidsObj.montarMenu();
        kidsObj.prepararPrato();
        kidsObj.obterPreco();

        veganObj.montarMenu();
        veganObj.prepararPrato();
        veganObj.obterPreco();
    }

}
