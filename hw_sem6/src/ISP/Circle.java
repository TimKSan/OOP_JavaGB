package ISP;
    // Этот класс использует только интерфейс Shape для подсчета площади,
    // окружности не нужен метод вычесления объема, поэтому интерфейсы разделены.
public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}
