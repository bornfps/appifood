package model;

public class Entrega implements Rastreavel {
    Pedido pedido;
    String statusEntrega;
    String localizacao;

 
    public Entrega(Pedido pedido) {
        this.pedido = pedido;
        this.statusEntrega = "Em andamento";
        this.localizacao = "Armazém Central";
    }

    @Override
    public void atualizarStatus(String novoStatus) {
        this.statusEntrega = novoStatus;
        System.out.println("Status da entrega atualizado para: " + novoStatus);
    }

    @Override
    public String consultarStatus() {
        return this.statusEntrega;
    }

    public void atualizarLocalizacao(String novaLocalizacao) {
        this.localizacao = novaLocalizacao;
        System.out.println("Localização atualizada para: " + novaLocalizacao);
    }

    public void exibirInformacoesEntrega() {
        System.out.println("Status da entrega: " + statusEntrega);
        System.out.println("Localização: " + localizacao);
    }
}
