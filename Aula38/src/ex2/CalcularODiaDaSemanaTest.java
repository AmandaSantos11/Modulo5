package ex2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcularODiaDaSemanaTest {
    @Test
    public void verificaOSeODiaDaSemanaEDomingo(){
        CalcularODiaDaSemana diaDaSemana = new CalcularODiaDaSemana();
        String diaRecebido = diaDaSemana.verificaSeODiaDaSemanaEDomingo("Domingo");
        assertEquals("Domingo",diaRecebido);
    }
}