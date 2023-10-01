import java.util.ArrayList;
import java.util.List;
/*
1.Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный 
метод getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику, заложенную в программе
4. Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре
 */
public class main {
    public static void main(String[] args) {
        List<HotDrink> listProduct = new ArrayList<>();
        listProduct.add(new HotDrink("Tea", 50, 0.3, 75));
        listProduct.add(new HotDrink("Coffee", 150, 0.2, 85));
        listProduct.add(new HotDrink("Juice", 100, 0.2, 15));

        HotDrinkVendingMAchine vendingMAchine = new HotDrinkVendingMAchine(listProduct);
        System.out.println(vendingMAchine.geProduct("Tea"));
    }
}