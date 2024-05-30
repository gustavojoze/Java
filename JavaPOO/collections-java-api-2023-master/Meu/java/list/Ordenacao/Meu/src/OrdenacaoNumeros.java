import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numerosList;

    public OrdenacaoNumeros(){
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numerosList.add(numero);
    }
    public List<Integer> ordenarAscendente(){
        List<Integer> listaDeAscendentes = new ArrayList<>(this.numerosList);
        if(!numerosList.isEmpty()){
            Collections.sort(listaDeAscendentes);
            return listaDeAscendentes;
        }
        else{
            throw new RuntimeException("A lista esta vazia");
        }
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> listaDeAscendentes = new ArrayList<>(this.numerosList);
        if(!listaDeAscendentes.isEmpty()){
            listaDeAscendentes.sort(Collections.reverseOrder());
            return listaDeAscendentes;
        }
        else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!numerosList.isEmpty()) {
            System.out.println(this.numerosList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        // Adicionando números à lista
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(54);
        numeros.adicionarNumero(76);

        // Exibindo a lista de números adicionados
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarAscendente());

        // Exibindo a lista
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDescendente());

        // Exibindo a lista
        numeros.exibirNumeros();
    }
}



