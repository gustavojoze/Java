import java.util.Random;

public abstract class Conta implements IConta {

    protected int agencia;
    protected int conta;
    protected double saldo;
    protected String tipoConta;
    protected int cpf;
    Random random = new Random();

    public Conta(String tipoConta, double saldo) {
        this.agencia = random.nextInt(100);
        this.conta = random.nextInt(100);
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }


    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public int getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "\n"+"Conta do Cliente: "+
                "Agencia: " + agencia +" | "+
                "Conta: " + conta +" | "+
                "Tipo Da Conta: " + tipoConta+ " | "+
                "Saldo: " + saldo + " \n"+
                "================================================================================="+"\n";

    }

    public void transferir() {

    }

    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
        System.out.print("Depósito concluído. Valor: " + valor + " Conta: " + getConta());
    }

    public void sacar(double valor) {
        if (valor < getSaldo()) {
            setSaldo(getSaldo() - valor);
            System.out.print("Saque concluído. Valor: " + valor + " Conta: " + getConta());
        } else {
            System.out.println("Não foi possivel concluir o saque na Conta: " + getConta());
        }
    }

}


