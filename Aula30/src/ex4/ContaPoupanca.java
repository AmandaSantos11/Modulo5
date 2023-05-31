package ex4;
public class ContaPoupanca extends Conta implements CalculoDeTributos{
    public ContaPoupanca(String nome, String cpf, int numeroDaConta, double saldo) {
        super(nome, cpf, numeroDaConta, saldo);
    }
    @Override
    public double calculoTributo() {
        return 0;
    }
@Override
    public void mostrarInformacoesDoCliente(){
        System.out.println("Nome: "+this.nome+"\n"+"Cpf: "+this.cpf+"\n"+"Número da conta: "+this.numeroDaConta+"\n"+"Saldo: "+this.saldo+"\n");
        System.out.println("Será debitado o seguinte valor: ");
        double tributoContaPoupanca = calculoTributo();
        System.out.println("Conta poupança: R$"+tributoContaPoupanca);
        System.out.println("--------------------------");
    }
}