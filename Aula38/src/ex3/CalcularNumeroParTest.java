package ex3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcularNumeroParTest {
    @Test
    public void oNumeroDeveSerPar(){
    CalcularNumeroPar calculaNumero = new CalcularNumeroPar();

    boolean numero = calculaNumero.verificaSeNumeroEPar(6);

    assertEquals(true, numero);
    }
}