package ContaBancaria;
import java.io.Serializable;

/**
 * Classe que abstrai uma Conta Bancaria
 * @author Kaique Souza Santos
 * @version 1.0
 */

public class Conta implements Serializable {
    private static final long serialVersionUID = 1L;
    private int agencia;
    private int numero;
    private double saldo;

    public Conta(){

    }

    public int getAgencia() {return agencia;}

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Realiza um desposito na conta corrente
     * @param agencia O numero da agencia
     * @param numero O numero da conta
     * @param saldo O valor que será depositado
     * @return O numero do protocolo de confirmação
     */

    public Conta(int agencia, int numero, double saldo){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    /**
     * Acrescenta valor ao Saldo da Conta
     * @param valor que será depositado
     */

    public void depositar(double valor){
        this.saldo += valor;
    }

    /**
     * Retira o valor do Saldo da Conta
     * @param valor que será retirado
     */

    public void retirar(double valor){
        this.saldo -= valor;
    }

    /**
     * Verifica o Saldo da Conta
     * @return Valor do Saldo da Conta
     */

    public double getSaldo(){
        return this.saldo;
    }
}
