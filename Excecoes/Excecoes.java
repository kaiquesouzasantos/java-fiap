package Excecoes;

public class Excecoes {
    public static void main(String[] args) {
        try{
            int val = 10 / 0;
            int[] valores = new int[3];
            System.out.println(valores[4]);

            String nome = null;
            System.out.println(nome.length());

            int numero = Integer.parseInt("zero");
        } catch (ArithmeticException e){
            System.out.println("DIVISÃO POR ZERO!");
            System.out.println(e.getMessage()); // mensagem da lista de erros
            e.printStackTrace(); // pilha de erro da exceção
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("POSIÇÂO DE ARRAY INVÀLIDA!");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (NullPointerException e){
            System.out.println("VARIAVEL NÃO INTANCIAVEL PARA O USO DO LENGTH!");
        } catch (NumberFormatException e){
            System.out.println("NÃO É POSSIVEL CONVERTER!");
        } catch (Exception e){
            System.out.println("ERRO DE EXECUÇÃO DO PROGRAMA!");
        } finally {
            System.out.println("SEMPRE PASSARA POR AQUI, EXISTINDO EXCEÇÕES OU NÃO.");
        }
    }
}
