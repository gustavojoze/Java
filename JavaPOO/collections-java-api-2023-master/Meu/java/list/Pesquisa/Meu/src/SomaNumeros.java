import java.util.ArrayList;
import java.util.List;

//2. Soma de Números
//Crie uma classe chamada "SomaNumeros" que possui uma lista de números inteiros como atributo. Implemente os seguintes métodos:
//
//adicionarNumero(int numero): Adiciona um número à lista de números.
//calcularSoma(): Calcula a soma de todos os números na lista e retorna o resultado.
//encontrarMaiorNumero(): Encontra o maior número na lista e retorna o valor.
//encontrarMenorNumero(): Encontra o menor número na lista e retorna o valor.
//exibirNumeros(): Retorna uma lista contendo todos os números presentes na lista.
public class SomaNumeros {
    private List<Numero> listaNumero;

    public SomaNumeros() {
        this.listaNumero = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaNumero.add(new Numero(numero));
    }

    public int calcularSoma() {
        int Soma = 0;
        List<Numero> numeroList = new ArrayList<>();
        for (Numero l : listaNumero) {
            Soma += l.getNumero();
        }
        return Soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!listaNumero.isEmpty()) {
            for (Numero l : listaNumero) {
                if (l.getNumero() >= maiorNumero) {
                    maiorNumero = l.getNumero();
                }
            }
        }
        return maiorNumero;
    }
    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!listaNumero.isEmpty()) {
            for (Numero l : listaNumero) {
                if (l.getNumero() <= menorNumero) {
                  menorNumero = l.getNumero();
                }
            }
        }
        return menorNumero;
    }


    public static void main(String[] args) {
        SomaNumeros n = new SomaNumeros();
        n.adicionarNumero(1);
        n.adicionarNumero(2);
        n.adicionarNumero(3);
        n.adicionarNumero(4);
        System.out.println(n.listaNumero);
        System.out.println("A soma da lista:"+n.calcularSoma());
        System.out.println("O maior numero da lista:"+n.encontrarMaiorNumero());
        System.out.println("O menor numero da lista:"+n.encontrarMenorNumero());
    }
}




