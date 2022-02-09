package Collections;
import java.util.HashMap;


public class TesteMap {
    public static void main(String[] args) {
        HashMap<String, String> caixa = new HashMap<String, String>();

        caixa.put("M2225", "Kaique");
        caixa.put("M2226" , "Maria");
        caixa.put("M2227" , "Joao");
        caixa.put("M2228" , "Carlos");

        System.out.println(caixa.isEmpty());
        System.out.println(caixa.size());
        System.out.println(caixa.containsKey("M2225"));
        System.out.println(caixa.containsValue("Kaique"));
        System.out.println(caixa);
    }
}
