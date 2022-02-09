package Produto;

public class TesteProduto {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[2];

        Produto produto_01 = new Produto();
        produto_01.setNome("Limao");
        produto_01.setDescricao("Galego");
        produto_01.setValor(4);

        Produto produto_02 = new Produto();
        produto_02.setNome("Maça");
        produto_02.setDescricao("Gala");
        produto_02.setValor(5);

        produtos[0] = produto_01;
        produtos[1] = produto_02;

        for(int i = 0; i < produtos.length; i++){
            System.out.println(produtos[i].toString());
        }

        for(Produto prod : produtos){
            System.out.println(prod.toString());
        }

        Produto[][] localizacaoProduto = new Produto[10][3];

        localizacaoProduto[2][1] = produto_01;
        localizacaoProduto[2][2] = produto_02;

        System.out.println(localizacaoProduto[2][1].getNome());
    }
}
