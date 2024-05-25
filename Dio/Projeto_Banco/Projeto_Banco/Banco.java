import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contaList = new ArrayList<>();
    private List<Cliente> clienteList = new ArrayList<>();

    public Banco(String nome, List<Conta> contaList, List<Cliente> clienteList) {
        this.nome = nome;
        this.contaList = contaList;
        this.clienteList = clienteList;
    }

    public Banco() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContaList() {
        return contaList;
    }

    public void setContaList(List<Conta> contaList) {
        this.contaList = contaList;
    }

    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }

    public void cadastrarCliente(String nome, double saldo, int cpf, String telefone, String senha, String tipoConta) {
        if (tipoConta.equalsIgnoreCase("corrente")) {
            ContaCorrente contaCorrente = new ContaCorrente(tipoConta, saldo);
            Cliente cliente = new Cliente(nome, cpf, telefone, senha, contaCorrente);
            this.clienteList.add(cliente);
            this.contaList.add(contaCorrente);
        } else if (tipoConta.equalsIgnoreCase("poupança")) {
            ContaPoupanca contaPoupanca = new ContaPoupanca(tipoConta, saldo);
            Cliente cliente = new Cliente(nome, cpf, telefone, senha, contaPoupanca);
            this.clienteList.add(cliente);
            this.contaList.add(contaPoupanca);
        }
        System.out.println("Cliente cadastrado com sucesso");
    }


    public Cliente procurarCliente(int cpf) {
        for (Cliente clienteLista : getClienteList()) {
            if (clienteLista.getCpf() == cpf) {
                return clienteLista;
            }
        }
        return null;
    }

    public Conta pegarContaCliente(int cpf) {
        return this.procurarCliente(cpf).getConta();
    }


    public void exibirListaConta() {
        System.out.println(contaList);
    }

    public void exibirListaCliente() {
        System.out.println(clienteList);
    }

}


