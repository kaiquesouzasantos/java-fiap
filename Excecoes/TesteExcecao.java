package Excecoes;

public class TesteExcecao {
    public static void main(String[] args){
        try{
            int val = 10 / 0;
            System.out.println(val);
        }catch(Exception e){ // captura excecao(qualificação exceção = e)
            e.printStackTrace();// printa a pilha de erro
        }

        /* TIPOS DE EXCEÇÂO:
            CHECKED: obriga a tratar a exceção
            UNCHECKED: não obriga o tratamento
            ERROR: não pode ser tratado
         */
    }
}
