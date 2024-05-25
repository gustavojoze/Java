public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco();
        banco.cadastrarCliente("Gustavo", 10.0, 123456, "1234-0998", "gustavo123456", "Corrente");
        banco.cadastrarCliente("Jefferson", 10.0, 654321, "3425-0984", "jefferson654321", "Poupança");

        Cliente clienteUm = (banco.procurarCliente(123456));
        Cliente clienteDois = (banco.procurarCliente(654321));

        Conta contaClienteUm = clienteUm.getConta();
        Conta contaClienteDois = clienteDois.getConta();
        System.out.println(clienteUm);

        contaClienteUm.depositar(10.0);
        System.out.println(clienteUm);

        contaClienteUm.sacar(10.0);
        System.out.println(clienteUm);

        contaClienteUm.transferir(contaClienteDois,5);
        banco.exibirListaCliente();
        contaClienteDois.transferir(contaClienteUm,20);
    }

}
