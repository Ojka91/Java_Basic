public class Items {
    private String name;
    private Double price;
    private Integer stock = 10;



    public Items(){

    }

    public Items(String name, Double price){
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(){
        this.stock = this.stock-1;
    }



    @Override
        public String toString() {
            return "Items{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    ", stock=" + stock +
                    '}';
    }
}