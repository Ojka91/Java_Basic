import java.util.*;

public class Cart {

    private String name;
    private Double price = 0.0;
    private ArrayList<Items> products = new ArrayList<Items>();
    private ArrayList<Items> listOfProducts = new ArrayList<Items>();
    private Double off = 0.0;
    private Double finalPrice = 0.0;



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
            addList(product);
            product.setQuantity();
            setOff(product);
        }else {
            System.out.println("No more products left");
        }

    }

    public void addList(Items product){
            if (!this.listOfProducts.contains(product)){
                listOfProducts.add(product);

        }
    }



    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
       if (products.size()> 4){
           this.price += price - (price/10);
       }else{
           this.price += price;
       }
    }


    public Double getOff() {
        return off;
    }

    public void setOff(Items product) {
        this.off = off + product.getPrice() * (Math.floor(product.getQuantity()/4));

    }
    public Double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice() {
        this.finalPrice =  price - off;
    }

    public ArrayList<Items> getProducts() {
        return products;
    }

    public ArrayList<Items> getListOfProducts() {
        return listOfProducts;
    }
}
