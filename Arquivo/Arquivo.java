package Arquivo;
import java.io.*;
import java.util.ArrayList;

public class Arquivo
{
    public static void main(String[] args)
    {
        String nomeArquivo = "estoque.csv";
        String diretorio = System.getProperty("user.home");
        String caminho = diretorio+"\\"+nomeArquivo;

        ArrayList<String> conteudo = new ArrayList<>();
        conteudo.add("PRODUTO; QUANTIDADE; UNIDADE MEDIA; VALOR UNIDADE;");
        conteudo.add("Pera; 200; pct; R$ 5,40;");
        conteudo.add("Morango; 400; cx; R$ 6,50;");
        conteudo.add("Abacaxi; 280; un; R$ 5,00;");

        // gravarEstoque(nomeArquivo, caminho, conteudo);
        lerEstoque(caminho, diretorio);
    }

    public static void gravarEstoque(String nomeArquivo, String caminho, ArrayList<String> conteudo)
    {
        FileWriter stream;
        PrintWriter print;

        try
        {
            stream = new FileWriter(caminho); // stream => conexao de escrita
            print = new PrintWriter(stream); // PrintWritet => escreve

            for(String linha:conteudo)
            {
                print.println(linha);
            }

            // fecha a conexao
            print.close();
            stream.close();

            System.out.print("Arquivo "+nomeArquivo+" foi salvo em "+caminho);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void lerEstoque(String caminho, String diretorio)
    {
        try
        {
            FileReader stream = new FileReader(caminho); // abre o arquivo
            BufferedReader reader = new BufferedReader(stream); // faz a leitura indiviual da linha e retorna String
            String linha = reader.readLine(); // atribui á uma varaivel a leitura

            while (linha != null)
            {
                System.out.println(linha);
                linha = reader.readLine();
            }

            reader.close();
            stream.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        File arquivo = new File(caminho);

        if(arquivo.exists())
        {
            System.out.println("O arquivo existe!"+
                    "\nPode ser lido: "+arquivo.canRead()+
                    "\nPode ser gravado: "+arquivo.canWrite()+
                    "\nTamanho: "+arquivo.length()+
                    "\nCaminho:"+arquivo.getPath());
        }
        else
        {
            try
            {
                if(arquivo.createNewFile())
                {
                    System.out.println("ARQUIVO CRIADO");
                }
                else
                {
                    System.out.println("ARQUIVO NÃ CRIADO");
                }
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }

        File fd = new File(diretorio);

        if(fd.exists())
        {
            System.out.println("EXISTE!");
        }
        else
        {
            if(fd.mkdir())
            {
                System.out.println("CRIADO!");
            }
            else
            {
                System.out.println("NÂO CRIADO!");
            }
        }
    }
}
