import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado(){
        this.convidadoSet = new HashSet<>();
    }
    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
               convidadoParaRemover = c;
               break;
            }
        }
    convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return  convidadoSet.size();
    }
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidado convidado = new ConjuntoConvidado();
        convidado.adicionarConvidado("acre",3);
        convidado.adicionarConvidado("espanha",4);
        convidado.adicionarConvidado("tuquia",32);
        convidado.adicionarConvidado("alpha",5);

        convidado.exibirConvidados();

        System.out.println("Existem " + convidado.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        // Removendo um convidado do conjunto por código de convite
        convidado.removerConvidadoPorCodigoConvite(4);
        System.out.println("Existem " + convidado.contarConvidados() + " convidado(s) dentro do Set de Convidados após a remoção");

        // Exibindo os convidados atualizados no conjunto
        System.out.println("Convidados no conjunto após a remoção:");
        convidado.exibirConvidados();

    }
}
