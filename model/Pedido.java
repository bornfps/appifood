package model;

public class Pedido implements Rastreavel {
    Usuario usuario;
    ItemCardapio[] itens;
    private double total;  
    String status;  

    public Pedido(Usuario usuario, ItemCardapio[] itens) {
        this.usuario = usuario;
        this.itens = itens;
        this.total = calcularTotal();
        this.status = "Em preparação";  
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemCardapio item : itens) {
            total += item.preco;
        }
        return total;
    }

    public void exibirResumo() {
        System.out.println("Pedido de " + usuario.nome);
        for (ItemCardapio item : itens) {
            System.out.println("Item: " + item.nome + " - R$" + item.preco);
        }
        System.out.println("Total: R$" + total);
        System.out.println("Status do Pedido: " + status);
    }

    @Override
    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
        System.out.println("Status do pedido atualizado para: " + novoStatus);
    }

    @Override
    public String consultarStatus() {
        return this.status;
    }

    public double getTotal() {
        return this.total;
    }
}
