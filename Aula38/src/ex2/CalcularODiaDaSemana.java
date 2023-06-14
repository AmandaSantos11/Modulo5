package ex2;
public class CalcularODiaDaSemana {
    String diaDaSemana = "Domingo";
    public String verificaSeODiaDaSemanaEDomingo(String diaRecebido){
        if(getDiaDaSemana().equals(diaRecebido)){
            System.out.println("Domingo é o melhor dia para ir à feira");
        }
        else{
            System.out.println("Esse não é um bom dia para ir à feira");
        }
        return diaRecebido;
    }
    public String getDiaDaSemana() {
        return diaDaSemana;
    }
}