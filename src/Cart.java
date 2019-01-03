import java.util.*;

public class Cart {

    private String name;
    private Double price = 0.0;
    private ArrayList<Items> products = new ArrayList<Items>();


    public Cart(){

    }
    public Cart(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addProduct(Items product){
        if (product.getStock() > 0){
            products.add(product);
            product.setStock();
            setPrice(product.getPrice());
        }

    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price += price;
    }

    public ArrayList<Items> getProducts() {
        return products;
    }




}
