import java.util.ArrayList;
import java.util.List;
/*
 * � Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, содержащий в себе методы
initProducts (List <Product>) сохраняющий в себе список исходных продуктов и getProduct(String name)

� Реализуйте конструкторы, get/set методы, постройте логику ТорговогоАвтомата на основе кода
сделанного в предыдущем задании.

� Сделайте класс Товар абстрактным, создайте нескольких наследников (к примеру: БутылкаВоды),
сделайте интерфейсом ТорговыйАвтомат и реализуйте класс какого-то одного типа
ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтомат)

Переопределите метод toString для Товара, запустите программу, после этого переопределите для
наследника этот метод, после запуска обратите внимание на изменение поведения.

� Создайте перегруженный метод выдачи товара ТорговымАвтоматом дополнив дополнительным
входным параметром (пример: getProduct(String name) выдающий товар по имени, создайте метод
возвращающий товар по имени и какому-либо параметру товара getProduct(String name, int volume)
 */
public class main {
    public static void main(String[] args) {
        List<HotDrink> listProduct = new ArrayList<>();
        listProduct.add(new HotDrink("OOPseminar", 7, 2));
        listProduct.add(new HotDrink("OOPLec", 7, 1));
        listProduct.add(new HotDrink("Dz", 5, 4));
        listProduct.add(new HotDrink("Java", 20, 100));
        listProduct.add(new HotDrink("Test", 11, 5));
        HotDrinkVendingMAchine vendingMAchine = new HotDrinkVendingMAchine(listProduct);
        System.out.println(vendingMAchine.geProduct("OOPseminar"));
    }
}
