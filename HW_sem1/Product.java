public abstract class Product {
    private String name;
    private double price;
    private double volume;

    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String name, double price, double volume) {
        this.name = name;
        this.price = price;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", volume=" + volume + "]";
    }

    
    
}
