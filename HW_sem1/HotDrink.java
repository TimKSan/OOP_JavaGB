//1.Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.

public class HotDrink extends Product {
    private int temper;

    public HotDrink(String name, double price, double volume, int temper) {
        super(name, price, volume);
        this.temper = temper;
    }

    @Override
    public String toString() {
        return "Напиток: {" + 
        "Название = " + super.getName() + '\\' +
        "Стоимость = " + super.getPrice() + '\\' +
        "Объем = " + super.getVolume() + '\\' +
        "Температура = " + temper + '}';
    }

    public int getTemper() {
        return temper;
    }

    public void setTemper(int temper) {
        this.temper = temper;
    }
}