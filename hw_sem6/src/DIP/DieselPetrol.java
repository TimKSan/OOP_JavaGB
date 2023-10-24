package DIP;
    // Этот класс нижнего уровня он зависим от абстрактного
    // интерфейса Engine и не имеет влияния на класс Car, т.к. создается через интерфейс.
public class DieselPetrol implements Engine {
    @Override
    public void start() {
        System.out.println("Запустили дизельный двигатель");
    }
}
