package ContaEspecial;

public class TesteContaEspecial
{
    public static void main(String[] args)
    {
        ContaCorrente cc = new ContaCorrente();

        try
        {
            cc.sacar(20);
        }
        catch (SaldoInsuficienteException e)
        {
            e.printStackTrace();
        }

    }
}
