package Meu;

import java.util.Objects;

public class Tarefa {
    private String descricao;
    private Boolean situacao;

    public Tarefa(String descricao, Boolean situacao) {
        this.descricao = descricao;
        this.situacao = situacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }


    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", situacao=" + situacao +
                '}';
    }
}
