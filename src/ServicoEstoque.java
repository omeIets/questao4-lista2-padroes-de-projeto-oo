public class ServicoEstoque {
    public static boolean isAvailable(Produto product){
        /*Verifica se o produto está disponível no estoque*/
        System.out.println("[Estoque] Verificando disponibilidade de: " + product.name);
        return true;
    }
}