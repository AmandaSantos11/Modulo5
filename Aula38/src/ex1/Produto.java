package ex1;

import java.math.BigDecimal;
public class Produto {
    String nome;
    BigDecimal preco;
    public Produto(String nome, BigDecimal preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public BigDecimal getPreco() {
        return preco;
    }
    public void comprarProduto(Produto produto, BigDecimal menorPreco){
        if(produto.getPreco().equals(menorPreco)){
            System.out.println("Você comprou");
        }
        else{
            System.out.println("A compra não foi realizada");
        }

    }
}