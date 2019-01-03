import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Items Pen = new Items("Pen", 4.0);
        Items Vacuum = new Items("Vacuum", 105.15);
        Items Bike = new Items("Bike", 399.99);
        Items Laptop = new Items("Laptop", 500.0);
        Cart ShoppingCart1 = new Cart ("Cart1");


        ShoppingCart1.addProduct(Bike);
        ShoppingCart1.addProduct(Pen);
        ShoppingCart1.addProduct(Bike);

        System.out.println(ShoppingCart1.getProducts());
        System.out.println(ShoppingCart1.getPrice());



    }
}
