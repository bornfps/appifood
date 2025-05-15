package app;

import model.*;

public class AppEntrega {
    public static void main(String[] args) {
        ItemCardapio item1 = new ItemCardapio("Pizza", 30.0);
        ItemCardapio item2 = new ItemCardapio("Refrigerante", 5.0);

        Usuario usuario = new Usuario("Paulin", "paulinnn@email.com", "Rua 19, 123");

        ItemCardapio[] itens = { item1, item2 };
        Pedido pedido = usuario.fazerPedido(itens);

        pedido.exibirResumo();

        pedido.atualizarStatus("Enviado para entrega");

        Entrega entrega = new Entrega(pedido);
        entrega.atualizarLocalizacao("Rumo à casa de PaulinhoJuninho");
        entrega.exibirInformacoesEntrega();

        Pagamento pagamento = new Pagamento(pedido.getTotal());
        pagamento.processar();
    }
}
