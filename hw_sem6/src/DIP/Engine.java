package DIP;
    // Это абстрактный интерфейс, который не зависим от
    // класса Car и классов DieselPetrol и PetrolEngine, но единственный его метод используется ими.
public interface Engine {
    public void start();
}
