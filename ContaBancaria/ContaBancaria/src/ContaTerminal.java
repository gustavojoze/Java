import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
   
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        int numero; 
        String agencia;
        String nomeCliente;
        double saldo;
        
        System.out.println("Digite o seu nome:");
        nomeCliente = scanner.next();
        System.out.println("Digite o número da Agencia:");
        agencia = scanner.next();
        System.out.println("Digite o número da conta:");
        numero = scanner.nextInt();
        System.out.println("Digite seu saldo:");
        saldo = scanner.nextDouble();

        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", e sua conta: "+numero+ " e seu saldo: " + saldo +" já está disponível para saque");
        
    }


}
