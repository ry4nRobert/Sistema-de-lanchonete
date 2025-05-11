package Lanchonete;
public class Main {
    public static void main(String[] args) {


        Item item1 = new Item("Coxinha de frango", 7.99, 1);
        Item item2 = new Item("Pastel de carne", 9.99, 2);
        Item item3 = new Item("Pastel de frango", 9.99, 3);
        Item item4 = new Item("Pastel de misto", 9.99, 4);
        Item item5 = new Item("Enroladinho de salsicha", 6.99, 5);


        Item item6 = new Item("Coca-Cola", 5.99, 6);
        Item item7 = new Item("Guaraná Antartica", 4.99, 7);
        Item item8 = new Item("Fanta Guaraná", 4.99, 8);
        Item item9 = new Item("Fanta Laranja", 4.99, 9);
        Item item10 = new Item("Pepsi", 4.99, 10);


        Carrinho c = new Carrinho();
        
        c.adicionarItem(item1);
        c.adicionarItem(item5);
        c.adicionarItem(item6);
        c.adicionarItem(item10);

        c.removerItem(5);
        c.adicionarItem(item3);

        c.calcularPreco();

    }
}
