import entities.Computador;
import factory.ComputadorFactory;

public class Program {
    public static void main (String[] args){
        ComputadorFactory fabrica = new ComputadorFactory();

        Computador mac1=fabrica.getComputador(1,16,500);
        Computador mac2=fabrica.getComputador(2,16,500);
        Computador mac3=fabrica.getComputador(3,32,1000);
        System.out.println("MAC1: " +mac1);
        System.out.println("MAC2: " +mac2);
        System.out.println("MAC2: " +mac3);

    }
}
