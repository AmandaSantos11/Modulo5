package ex4;
public class Conta {
    protected double saldo;
    protected String nome;
    protected int numeroDaConta;
    protected String cpf;
    protected Conta (String nome, String cpf,int numeroDaConta,double saldo){
        this.nome = nome;
        this.cpf = cpf;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }
    protected void mostrarInformacoesDoCliente(){
        System.out.println("Nome: "+this.nome+"\n"+"Cpf: "+this.cpf+"\n"+"Número da conta: "+this.numeroDaConta+"\n"+"Saldo: "+this.saldo);
        System.out.println("--------------------------");
        }
    }