public class PedidoFacade {

    /* retorna booleano se o pedido deu certo ou não */
    public boolean fazerPedido(Produto produto) {
        if (!ServicoEstoque.isAvailable(produto)) {
            System.out.println("Pedido cancelado: produto indisponivel");
            return false;
        }
        if (!ServicoPagamento.makePayment()) {
            System.out.println("Pedido cancelado: pagamento recusado");
            return false;
        }
        ServicoRemessa.shipProduct(produto);
        System.out.println("Pedido concluido com sucesso!");
        return true;
    }
}