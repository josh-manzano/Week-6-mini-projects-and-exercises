package week6.Inheritance.ShoppingCartSystem;

public class GroceryStore {
    public static void main(String[] args) {
        Product myApple2 = new DiscountedProduct("Apple", 10.00);
        Product myBanana = new Product("Banana", 7.99);


        Cart myCart = new Cart();
        myCart.addItem(myApple2);
        myCart.addItem(myBanana);
        myCart.printReceipt();





    }

}
