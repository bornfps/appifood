package model;

public class Pagamento {
    double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public void processar() {
        System.out.println("Pagamento de R$" + valor + " processado com sucesso.");
    }
}
