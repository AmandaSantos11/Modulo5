package ex2;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean continuarX=true;
        boolean continuarY=true;
        String x;
        String y;
        int numeroX=0;
        int numeroY=0;
        System.out.println("Eu sei dividir!");
        do{
            try{
                System.out.println("Informe o primeiro valor: ");
                 x = teclado.nextLine();
                 if(x.isBlank()){
                     throw new UnsupportedOperationException();
                 }
                 if(x.matches("\\d+")){
                     numeroX = Integer.parseInt(x);
                     continuarX=true;
                 }
                 else{
                     throw new InputMismatchException();
                 }
            }catch (InputMismatchException | UnsupportedOperationException error){
                System.err.println("Digite apenas números!");
                continuarX=false;
            }
        }while (!continuarX);

        do{
            try{
                System.out.println("Informe o segundo valor: ");
                 y = teclado.nextLine();
                if(y.isBlank()){
                    throw new UnsupportedOperationException();
                }
                if(y.matches("\\d+")){
                    numeroY = Integer.parseInt(y);
                    continuarY=true;
                }
                else{
                    throw new InputMismatchException();
                }
            }catch (InputMismatchException | UnsupportedOperationException error){
                System.err.println("Digite apenas números!");
                continuarY=false;
            }
        }while (!continuarY);
        double r = (numeroX/numeroY);
        System.out.println("O resultado da divisão é "+r);
    }
}