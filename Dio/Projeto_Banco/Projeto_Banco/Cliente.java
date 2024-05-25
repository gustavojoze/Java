public class Cliente {
    private String nome;
    private int cpf;
    private String senha;
    private String telefone;
    private Conta conta;

    public Cliente(String nome, int cpf, String telefone, String senha, Conta conta) {
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
        this.telefone = telefone;
        this.conta = conta;
    }

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return "*******";
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "\n"+"================================================================================="+"\n"+
                "Cliente: " +
                "Nome: " + nome + " | "+
                "Cpf: " + cpf + " | " +
                "Senha: " + getSenha() + " | "+
                "Telefone: " + telefone+
               conta + "\n";
    }

}


