package Meu;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavraSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavraSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
       String PalavraRemover = null;
        for (String l : palavraSet) {
            if (l == palavra) {
                PalavraRemover = l;
                break;
            }

        }
        palavraSet.remove(PalavraRemover);
    }

    public boolean verificarPalavra(String palavra) {
        return palavraSet.contains(palavra);
    }
    public void exibirPalavras(){
        System.out.println(palavraSet);
    }

    public static void main(String[] args) {
       ConjuntoPalavrasUnicas plv = new ConjuntoPalavrasUnicas();
       plv.adicionarPalavra("Minha");
       plv.adicionarPalavra("Vo");
       plv.adicionarPalavra("Tem");
       plv.adicionarPalavra("Muitas");
       plv.adicionarPalavra("Joias");
       plv.adicionarPalavra("No");
       plv.adicionarPalavra("Pescoço");
       plv.exibirPalavras();
       plv.removerPalavra("Joias");
       plv.exibirPalavras();
        System.out.println("Verificamos e é "+plv.verificarPalavra("Vo")+" contem");
    }

}

