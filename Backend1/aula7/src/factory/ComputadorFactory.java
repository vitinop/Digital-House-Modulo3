package factory;

import entities.Computador;

import java.util.HashMap;
import java.util.Map;

public class ComputadorFactory {
    private static Map<String, Computador> flyweight = new HashMap<>();

    public  Computador getComputador( int id, int ram , int hd) {
        String comp = "RAM: " + ram + " HD: " + hd;
        System.out.println(comp);

        if (!flyweight.containsKey(comp)) {
            flyweight.put(comp, new Computador(id, ram, hd));
            System.out.println("PC instanciado");
            return flyweight.get(comp);
        }
        System.out.println("PC Obitido da memoria");
        return flyweight.get(comp);

    }

}
