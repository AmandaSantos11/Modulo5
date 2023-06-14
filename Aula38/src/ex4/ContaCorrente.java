package ex4;
public class ContaCorrente {
    int numeroDaConta;
    String nomeDoCorrentista;
    double saldo;
    public ContaCorrente(int numeroDaConta,String nomeDoCorrentista,double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoCorrentista = nomeDoCorrentista;
        this.saldo = saldo;
    }
    public void depositoConta(double valorQueSeraDepositado){
        setSaldo(getSaldo()+valorQueSeraDepositado);
        System.out.println("Saldo após o deposito: "+getSaldo());
    }
    public void saqueConta(double valorQueSeraSacado){
        if(getSaldo() < 5){
            System.out.println("Não pode sacar!");
        }
        else{
            setSaldo(getSaldo()-valorQueSeraSacado);
            System.out.println("Saque realizado com sucesso!");
        }
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}