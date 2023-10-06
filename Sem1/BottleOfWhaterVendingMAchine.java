import java.util.ArrayList;
import java.util.List;

public class BottleOfWhaterVendingMAchine implements VendingMAchine {
    List<HotDrink> productList;

    public List<HotDrink> getProductList() {
        return productList;
    }

    public void setProductList(List<HotDrink> productList) {
        this.productList = productList;
    }

    public BottleOfWhaterVendingMAchine(List<HotDrink> productList) {
        this.productList = new ArrayList<>(productList);
    }

    public HotDrink geProduct(String name, int volume) {
        for (HotDrink bottleOfWater : productList) {
            if (bottleOfWater.getName().equals(name) && bottleOfWater.getVolume() == volume) {
                return bottleOfWater;
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

    public void addBottleOfWhater(HotDrink bottleOfWater) {
        this.productList.add(bottleOfWater);
    }
}