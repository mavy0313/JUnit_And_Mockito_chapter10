package exercises.car;

public interface Car {
    Engine getEngine();
    Color getColor();
    Manufacturer getManufacturer();

    boolean isSport();
}
