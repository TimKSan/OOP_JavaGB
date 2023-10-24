package ISP;
// В интерфейсе один метод, т.к. он может быть применен только к 3D фигурам.
public interface Shape3D extends Shape{
    public double volume();
}
