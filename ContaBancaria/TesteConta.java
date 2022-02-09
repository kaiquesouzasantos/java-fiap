package ContaBancaria;

public class TesteConta{
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.depositar(50.0);
        conta.setAgencia(123);
        conta.setNumero(321);

        conta.depositar(1000);
        System.out.println(conta.getSaldo());

        Conta contaPoupancao = new Conta(111, 222, 1000);
        contaPoupancao.retirar(50);

        System.out.println(contaPoupancao.getSaldo());

    }
}
