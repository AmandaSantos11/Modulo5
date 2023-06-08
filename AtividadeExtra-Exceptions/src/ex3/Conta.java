package ex3;
public class Conta{
    private double saldo;
    public double valorQueSeraDepositado;
    public double getValorQueSeraDepositado() {
        return valorQueSeraDepositado;
    }
    public void setValorQueSeraDepositado(double valorQueSeraDepositado) {
        this.valorQueSeraDepositado = valorQueSeraDepositado;
    }
    public void deposita(double valorQueSeraDepositado){
        saldo += valorQueSeraDepositado;
        setValorQueSeraDepositado(valorQueSeraDepositado);
    }
    public void saca(double valorQueSeraSacado){
        try{
            if (valorQueSeraSacado > saldo){
                throw new ContaExcecao();
            }
            else{
                System.out.println("Você sacou:R$"+valorQueSeraSacado);
            }
        }catch (ContaExcecao error){
            System.out.println("Valor indisponível para saque!");
            System.out.println("Saldo disponível:R$"+saldo); //RESOLUÇÃO DO EX4
        }
    }
    public void setLimite(double limite){
        if(valorQueSeraDepositado<limite){
            System.out.println("Você depositou:R$"+getValorQueSeraDepositado());
        }
        else {
            System.out.println("Não é possível depositar mais! Limite permitido é de:R$"+limite);
        }
    }
}