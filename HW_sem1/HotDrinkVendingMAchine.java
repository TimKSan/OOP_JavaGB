import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMAchine implements VendingMAchine {
    List<HotDrink> productList;

    public List<HotDrink> getProductList() {
        return productList;
    }

    public void setProductList(List<HotDrink> productList) {
        this.productList = productList;
    }

    public HotDrinkVendingMAchine(List<HotDrink> productList) {
        this.productList = new ArrayList<>(productList);
    }

    public HotDrink geProduct(String name, int price, double volume, int temper) {
        for (HotDrink hotDrink: productList) {
            if (hotDrink.getName().equals(name) && hotDrink.getPrice() == price && hotDrink.getVolume() == volume && hotDrink.getTemper() == temper) {
                return hotDrink;
            }
        }
        return null;
    }

    public HotDrink geProduct(String name, int price, int temper) {
        for (HotDrink hotDrink: productList) {
            if (hotDrink.getName().equals(name) && hotDrink.getPrice() == price && hotDrink.getTemper() == temper) {
                return hotDrink;
            }
        }
        return null;
    }

    public HotDrink geProduct(String name, int price) {
        for (HotDrink hotDrink : productList) {
            if (hotDrink.getName().equals(name) && hotDrink.getPrice() == price) {
                return hotDrink;
            }
        }
        return null;
    }

    @Override
    public Product geProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public void addBottleOfWhater(HotDrink hotDrink) {
        this.productList.add(hotDrink);
    }
}