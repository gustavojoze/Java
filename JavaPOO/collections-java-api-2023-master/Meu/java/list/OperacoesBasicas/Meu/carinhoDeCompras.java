package main.java.list.OperacoesBasicas.Meu.Meu;

import main.java.list.OperacoesBasicas.Meu.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class carinhoDeCompras {
    private List<Compras> comprasList;

    public carinhoDeCompras() {
        this.comprasList = new ArrayList<>();
    }

    public void adicionarCompra(String nome, double preco, int quantida) {
        comprasList.add(new Compras(nome, preco, quantida));
    }

    public void removerCompra(String nome) {
    List<Compras> comprasParaRemover = new ArrayList<>();
        for (Compras t : comprasList) {
            if (t.getNome().equalsIgnoreCase(nome)) {
                comprasParaRemover.add(t);
            }
        }
        comprasList.removeAll(comprasParaRemover);
    }

    public void quantidadeTotal() {
        List<Compras> comprasParaSomar = new ArrayList<>();
        double r = 0;
        for (Compras t : comprasList) {
            r += t.getQuantidade() * t.getPreco();
        }
        System.out.println("O preço total do carrinho foi de "+r);
    }

    public void exibirItens(){
        System.out.println(comprasList);
    }
    public static void main(String[] args) {
        carinhoDeCompras carrinho = new carinhoDeCompras();
        carrinho.adicionarCompra("Goiaba", 12.0, 2);
        carrinho.adicionarCompra("Nescau", 20.0, 5);
        carrinho.exibirItens();
        carrinho.removerCompra("Goiaba");
        carrinho.exibirItens();
        carrinho.quantidadeTotal();
    }
}


