/**
 * Задача 1 - Абстракция
Реализуйте класс Товар, содержащий данные о товаре, 
и ТорговыйАвтомат, содержащий в себе методы
initProducts (List <Product>) сохраняющий в себе список 
сходных продуктов и getProduct(String name)
 */
public abstract class Product {
    private String name;
    private double price;

    public String getName() {
        return name;
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
    
    public Product(String name, double price) {
    this.name = name;
    this.price = price;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }
    
}
