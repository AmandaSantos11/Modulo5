package ex4;
public class ContaCorrente extends Conta implements CalculoDeTributos{
    public ContaCorrente(String nome,String cpf,int numeroDaConta,double saldo) {
        super(nome,cpf,numeroDaConta,saldo);
    }
    @Override
    public double calculoTributo() {
        return (saldo*0.01);
    }
    @Override
    public void mostrarInformacoesDoCliente(){
        System.out.println("Nome: "+this.nome+"\n"+"Cpf: "+this.cpf+"\n"+"Número da conta: "+this.numeroDaConta+"\n"+"Saldo: "+this.saldo+"\n");
        System.out.println("Será debitado o seguinte valor: ");
        double tributoContaCorrente = calculoTributo();
        System.out.println("Conta corrente: R$"+tributoContaCorrente);
        System.out.println("--------------------------");
    }
}