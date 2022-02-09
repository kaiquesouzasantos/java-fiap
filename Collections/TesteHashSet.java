package Collections;
import java.util.HashSet;

public class TesteHashSet {
    public static void main(String[] args) {
        HashSet<String> cesta = new HashSet<String>();

        System.out.println(cesta.isEmpty());
        cesta.add("Maça");
        cesta.add("Maça");
        cesta.add("maça");

        System.out.println(cesta.isEmpty());
        System.out.println(cesta.size());
        System.out.println(cesta);
        // SET = não permite itens repetidos, ARRAYLIST = permite
    }
}
