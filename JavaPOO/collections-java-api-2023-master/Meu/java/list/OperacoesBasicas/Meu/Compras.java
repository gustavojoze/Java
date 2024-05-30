package main.java.list.OperacoesBasicas.Meu.Meu;

//Crie uma classe chamada "CarrinhoDeCompras" que representa um carrinho de compras online. O carrinho deve ser implementado como uma lista de itens. Cada item é representado por uma classe chamada "Item" que possui atributos como nome, preço e quantidade. Implemente os seguintes métodos:
//
//adicionarItem(String nome, double preco, int quantidade): Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
//removerItem(String nome): Remove um item do carrinho com base no seu nome.
//calcularValorTotal(): Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
//exibirItens(): Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.

public class Compras {
    private String nome;
    private double preco;
    private int quantidade;

    public Compras(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "\nCompras:\n " +
                "nome:" + nome +
                ", preco=" + preco +
                ", quantidade=" + quantidade;
    }

}
