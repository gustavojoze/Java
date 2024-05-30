public class Numero {
    private int numero;
    public Numero(int numero){
        this.numero =  numero;
    }
    public int getNumero(){return numero;}

    @Override
    public String toString() {
        return "Numero{" +
                "numero=" + numero +
                '}';
    }
}
