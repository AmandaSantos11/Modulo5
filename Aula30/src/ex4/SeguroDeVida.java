package ex4;
public class SeguroDeVida extends Conta implements CalculoDeTributos{
    public SeguroDeVida(String nome, String cpf, int numeroDaConta, double saldo) {
        super(nome, cpf, numeroDaConta, saldo);
    }
    @Override
    public double calculoTributo() {
        return 42;
    }
    @Override
    public void mostrarInformacoesDoCliente(){
        System.out.println("Nome: "+this.nome+"\n"+"Cpf: "+this.cpf+"\n"+"Número da conta: "+this.numeroDaConta+"\n"+"Saldo: "+this.saldo+"\n");
        System.out.println("Será debitado o seguinte valor: ");
        double tributoSeguroDeVida = calculoTributo();
        System.out.println("Seguro de vida: R$"+tributoSeguroDeVida);
        System.out.println("--------------------------");
    }
}