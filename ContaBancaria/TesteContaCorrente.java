package ContaBancaria;

public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();

        cc.setAgencia(1111);
        cc.setNumero(2222);
        cc.setTipo("PF");
        cc.setChequeEspecial(1000);
        cc.depositar(5000);
        System.out.println(cc.getSaldoDisponivel());
        cc.retirar(30);
        System.out.println(cc.getSaldo());
    }
}
