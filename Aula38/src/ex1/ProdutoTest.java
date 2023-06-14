package ex1;

import ex1.Produto;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProdutoTest {
    BigDecimal menorPreco = new BigDecimal("1.00");

    @Test
    public void deveraComprarOProdutoMaisBaratoNoPrimeiroProduto(){
        Produto produto1 = new Produto("Bola", new BigDecimal("1.00"));

        produto1.comprarProduto(produto1,menorPreco);

       assertEquals(menorPreco, produto1.getPreco());
    }
    @Test
    public void deveraComprarOProdutoMaisBaratoNoSegundoProduto(){
        Produto produto2 = new Produto("Apito", new BigDecimal("5.00"));

        produto2.comprarProduto(produto2,menorPreco);

        assertEquals(menorPreco, produto2.getPreco());
    }
    @Test
    public void deveraComprarOProdutoMaisBaratoNoTerceiroProduto(){
        Produto produto3 = new Produto("Avental", new BigDecimal("10.00"));

        produto3.comprarProduto(produto3,menorPreco);

        assertEquals(menorPreco, produto3.getPreco());
    }
}