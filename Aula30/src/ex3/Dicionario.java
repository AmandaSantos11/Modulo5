package ex3;
import java.util.HashMap;
import java.util.Map;
public class Dicionario {
   public Map<String, String> dicionario = new HashMap<>();
   public void inserirDados(){
       dicionario.put("Lapis", "Azul");
       dicionario.put("Bola", "Vermelha");
       dicionario.put("Dado", "Branco");
       dicionario.put("Boneca", "Rosa");
   }
    public void mostrarChaves(){
       for (Map.Entry<String, String> entry : dicionario.entrySet()) {
           System.out.println("Chave:"+entry.getKey()+" - "+"Valor:"+entry.getValue());
            }
   }
}