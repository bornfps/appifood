package model;

public class Usuario {
    String nome;
    String email;
    String endereco;

    public Usuario(String nome, String email, String endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }

    public Pedido fazerPedido(ItemCardapio[] itens) {
        Pedido pedido = new Pedido(this, itens);
        return pedido;
    }
}
