package DIP;
    // При создании экземпляра класса Car не имеет значения какой тип двигателя будет у него, программа отработает правильно. 
    // Принцип инверсии зависимостей соблюден.
public class Test {
    public static void main(String[] args) {
        Car car = new Car(new PetrolEngine());
        car.start();
        car = new Car(new DieselPetrol());
        car.start();
    }
}
