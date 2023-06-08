package ex3;
public class Main {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();

        minhaConta.deposita(100);
        minhaConta.setLimite(100);
        minhaConta.saca(1000);
    }
}