public class App {
    public static void main(String[] args) {
        

        Item item1 = new Item("Pão de queijo", 4.99,1);
        Item item2 = new Item("Café", 2.00, 2);
        Item item3 = new Item("Bolo de chocolate", 4.00, 3);
        Item item4 = new Item("Misto", 5.99, 4);

        Carrinho c = new Carrinho();

        c.adicionar(item1);
        c.adicionar(item3);
        c.adicionar(item2);
        c.adicionar(item4);

        c.remover(3);

        c.calcularpreco();
        

    }
}
