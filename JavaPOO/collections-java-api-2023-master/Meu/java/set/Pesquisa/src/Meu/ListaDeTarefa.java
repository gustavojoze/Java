package Meu;

import java.util.HashSet;
import java.util.Set;

public class ListaDeTarefa {
    Set<Tarefa> tarefaSet;

    public ListaDeTarefa() {
        this.tarefaSet = new HashSet<>();
    }
public void adicionarTarefa(String descricao, Boolean situcao){
        tarefaSet.add(new Tarefa(descricao, situcao));
}
    public void removerTarefa(String descricao) {
        Tarefa tarefaRemover = null;
        for (Tarefa c : tarefaSet) {
            if (c.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaSet.remove(c);
                break;
            }
            System.out.println("Item removido:"+c.getDescricao());
        }
    }
    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }
    public int contarTarefas(){
        return tarefaSet.size();
    }
    public Set<Tarefa> obterTarefasConcluidads(){
        Set<Tarefa> tarefaConcluidas = new HashSet<>();
        for (Tarefa c : tarefaSet){
        if(c.getSituacao().equals(true)){
            tarefaConcluidas.add(c);
        }
    }
        return tarefaConcluidas;
    }
    public Set<Tarefa> obterTarefasPendente(){
        Set<Tarefa> tarefaConcluidas = new HashSet<>();
        for (Tarefa c : tarefaSet){
            if(c.getSituacao().equals(false)){
                tarefaConcluidas.add(c);
            }
        }
        return tarefaConcluidas;
    }
    public Tarefa marcarTarefaConcluida(String descricao){
       Tarefa tarefa = null;
        for (Tarefa c:tarefaSet){
           if(c.getDescricao().equals(descricao)){
               c.setSituacao(true);
               tarefa = c;
           }
       }
    return tarefa;
    }
    public Tarefa marcarTarefaPendente(String descricao){
        Tarefa tarefa = null;
        for (Tarefa c:tarefaSet){
            if(c.getDescricao().equals(descricao)){
                c.setSituacao(false);
                tarefa = c;
            }
        }
        return tarefa;
    }
    public Set<Tarefa> limparLista(){
        tarefaSet.clear();
        return tarefaSet;
    }
    public static void main(String[] args) {
        ListaDeTarefa lista = new ListaDeTarefa();
        lista.adicionarTarefa("fazer a mala", true);
        lista.adicionarTarefa("fazer a cama", false);
        lista.adicionarTarefa("lavar o chão", false);
        lista.adicionarTarefa("legal", true);
        lista.adicionarTarefa("legal", true);
        lista.exibirTarefas();
        lista.removerTarefa("fazer a mala");
        lista.exibirTarefas();
        System.out.println("Há "+lista.contarTarefas()+" elementos na lista");
        System.out.println(lista.obterTarefasConcluidads());
        System.out.println(lista.obterTarefasPendente());
        System.out.println(lista.marcarTarefaConcluida("lavar o chão"));
        System.out.println(lista.marcarTarefaPendente("lavar o chão"));
        System.out.println(lista.limparLista());
        lista.exibirTarefas();
    }
}
