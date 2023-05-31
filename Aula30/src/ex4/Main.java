package ex4;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Conta> clientes = new ArrayList<>();

        clientes.add(new ContaCorrente("Amanda","35363434",45343,1200));
        clientes.add(new ContaPoupanca("Leonardo","3345653654",13843,1500));
        clientes.add(new SeguroDeVida("Helena","35792739824",23294,2100));

        for (Conta mostrar:clientes) {
            mostrar.mostrarInformacoesDoCliente();
        }
    }
}