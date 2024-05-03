

public class Iphone implements AparelhoTelefonico, RepodutorMusicial,NavegarNaInternet  {


    public void ligar() {
        System.out.println("Ligando");
    }


    public void atender() {
        System.out.println("Atendendo telefone");
    }


    public void iniciarCorrerioVoz() {
        System.out.println("Iniciando correio de voz");
    }


    @Override
    public void exibirPagina() {
        System.out.println("Entrando na pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void tocar() {
        System.out.println("Musica sendo tocada");
    }

    @Override
    public void pausar() {
        System.out.println("Musica sendo pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Musica selecionada");
    }
}
