package ContaEspecial;

public class ContaCorrente
{
    protected double saldo;

    public void sacar(double valor) throws SaldoInsuficienteException
    {
        if (valor > saldo)
        {
            throw new SaldoInsuficienteException();
        }
        saldo -= valor;
    }

    public double verificarSaldo()
    {
        return this.saldo;
    }
}
