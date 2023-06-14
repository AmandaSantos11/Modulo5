package ex4;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContaCorrenteTest {
    @Test
    public void verificaSeOMetodoDepositaEstaFuncionando(){
        ContaCorrente conta = new ContaCorrente(5501,"Amanda",5);
        conta.depositoConta(5);
        assertEquals(10,conta.getSaldo());
    }
    @Test
    public void verificaSeOMetodoSaqueEstaFuncionando(){
        ContaCorrente conta = new ContaCorrente(0001,"João",0);
        conta.saqueConta(10);
        assertEquals(0,conta.getSaldo());
    }
}