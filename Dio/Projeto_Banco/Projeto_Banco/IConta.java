import java.awt.*;

public interface IConta {

    public void transferir(Conta contaRecebedor, double valor);

    public void depositar(double valor);

    public void sacar(double valor);

}
