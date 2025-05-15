package week6.Inheritance.ShoppingCartSystem;

public class DiscountedProduct extends Product{

    private double discountPercentage;

    public DiscountedProduct(String name, double price) {
        super(name, price);
        this.discountPercentage = 10;
    }

    @Override
    public double getFinalPrice(){
        double productPrice =  getPrice();
        return productPrice * (1 - discountPercentage / 100);
    }

}
