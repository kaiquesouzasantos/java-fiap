package Collections;
import java.util.ArrayList;

public class TesteCollections {
    public static void main(String[] args) {
        ArrayList carrinho = new ArrayList();
        double valor_01 = 100.55;
        int valor_02 = 1, valor_03;

        carrinho.add(valor_01);
        carrinho.add("Uva");
        carrinho.add(valor_02);

        System.out.println(carrinho.get(0));
        System.out.println(valor_03 = (int) carrinho.get(2));

        System.out.println("---------------------------------------");

        ArrayList<String> carrinho_02 = new ArrayList<String>();
        System.out.println(carrinho_02.isEmpty());

        carrinho_02.add("Maça");
        carrinho_02.add("Morango");
        carrinho_02.add("Pera"); // add(elemento)
        carrinho_02.set(1,"Uva"); // set(indice, elemento)
        System.out.println(carrinho_02.contains("Maça")); // contains() => existe? [false-true]
        System.out.println(carrinho_02.indexOf("Maça")); // indexOf() =>  do item
        System.out.println(carrinho_02.get(carrinho_02.indexOf("Maça")));
        System.out.println(carrinho_02.lastIndexOf("Maça")); // lastIndexOf() => ultima ocorrencia dela dentro do ArrayList

        System.out.println(carrinho_02.size()); // size() => tamanho do ArrayList

        carrinho_02.remove(carrinho_02.indexOf("Maça"));
        System.out.println(carrinho_02.get(0));

        carrinho_02.clear(); // limpa o ArrayList

        System.out.println(carrinho_02.isEmpty()); // isEmpty() => vazio = true
    }
}
