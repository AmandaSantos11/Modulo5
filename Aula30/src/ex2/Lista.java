package ex2;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Lista {
    Set<Integer> numeros = new HashSet<>();
    Scanner digite = new Scanner(System.in);

    public  void pedirNumeros(){
        for (int i = 0; i < 8; i++) {
            System.out.println("Digite um número: ");
            numeros.add(digite.nextInt());
        }
        System.out.println(numeros);
    }
}