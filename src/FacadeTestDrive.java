public class FacadeTestDrive {
    public static void main(String[] args) {
        Produto produto = new Produto(1, "Notebook");

        PedidoFacade pedido = new PedidoFacade();
        pedido.fazerPedido(produto);
    }
}