public class ContaPoupanca extends Conta {

    public ContaPoupanca(String tipoConta, double saldo) {
        super(tipoConta, saldo);
    }
    @Override
    public void transferir(Conta contaRecebedor, double valor) {
        System.out.println("Não é possivel transferir porque é uma conta poupança");
    }


}

