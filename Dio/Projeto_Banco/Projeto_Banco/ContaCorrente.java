class ContaCorrente extends Conta {

    public ContaCorrente(String tipoConta, double saldo) {
        super(tipoConta, saldo);
    }
    @Override
    public void transferir(Conta contaRecebedor, double valor){
        if (this.getSaldo() < valor) {
            System.out.println("Saldo insuficiente");
        }
        this.setSaldo(this.getSaldo() - valor);
        contaRecebedor.setSaldo(contaRecebedor.getSaldo() + valor);
        System.out.println("Transferencia foi realizada com sucesso da Conta:"+this.getConta()+" para a Conta:"+contaRecebedor.getConta()+" no valor de "+valor+"!");
    }


}

