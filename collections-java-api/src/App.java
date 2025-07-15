public class App {
    public static void main(String[] args) throws Exception {
        

         CarrinhoCompras carrinhoDeCompras = new CarrinhoCompras();

         carrinhoDeCompras.adicionarItem("Lapis", 2, 2);
         carrinhoDeCompras.adicionarItem("caderno", 15, 5);
         carrinhoDeCompras.adicionarItem("bolsa", 52, 20);

         carrinhoDeCompras.exibirItens();

    }
}
