package ex3;
public class CalcularNumeroPar {
    public boolean verificaSeNumeroEPar(int numero){
        if(numero % 2 == 0){
            System.out.println("O número é par");
            return true;
        }
        else{
            System.out.println("O número é ímpar");
        }
    return false;
    }
}