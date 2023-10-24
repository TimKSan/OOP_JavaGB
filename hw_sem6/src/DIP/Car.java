package DIP;
// Класс Car является классом верхнего уровня и чтобы исключить
// возможность зависимости от классов нижнего уровня, создается
// абстрактный интерфейс Engine.
public class Car {
    public Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
}
