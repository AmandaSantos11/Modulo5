package ex1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Lista {
     Scanner digite = new Scanner(System.in);
     List<Integer> listaDeNumeros = new ArrayList<>();
    public void pedirNumeros(){
        for (int i = 0; i < 8; i++) {
            System.out.println("Digite um número: ");
            listaDeNumeros.add(digite.nextInt());
        }
        System.out.println(listaDeNumeros);
    }
}