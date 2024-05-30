import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
    private Set<Contato> contatoSet;

    public AgendaContato() {
        this.contatoSet = new HashSet<>();
    }
    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }
    public void exibirContato(){
        System.out.println(contatoSet);
    }
    public Set<Contato> pesquisarContato(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c:contatoSet){
        if(c.getNome().startsWith(nome)){
            contatosPorNome.add(c);
        }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
       Contato contatoAtualizado = null;
       for(Contato c:contatoSet){
           if(c.getNome().equalsIgnoreCase(nome)){
               c.setNumero(novoNumero);
               contatoAtualizado = c;
               break;
           }
       }
       return contatoAtualizado;
    }
    public static void main(String[] args) {
    AgendaContato eu = new AgendaContato();
    eu.adicionarContato("quem", 12);
    eu.adicionarContato("que2", 12);
    eu.adicionarContato("que2", 12);
    eu.adicionarContato("quem", 12);
    eu.exibirContato();
        System.out.println(eu.pesquisarContato("quem"));
    }
}

