public class ServicoRemessa {
    public static void shipProduct(Produto product){
        /*Conecta-se a serviço externo de logística para enviar o produto*/
        System.out.println("[Remessa] Enviando produto ao cliente: " + product.name);
    }
}