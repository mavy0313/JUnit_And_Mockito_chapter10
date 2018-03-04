package exercises;

public class CarImpl implements Car {

    private Engine engine;
    private Color color;
    private Manufacturer manufacturer;


    public CarImpl(Engine engine, Color color, Manufacturer manufacturer) {
        this.engine = engine;
        this.color = color;
        this.manufacturer = manufacturer;
    }

    @Override
    public Engine getEngine() {
        return engine;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    @Override
    public boolean isSport() {
        return getEngine().getNbOfCylinders() > 6
                && Color.RED == getColor()
                && "Ferrari".equals(getManufacturer().getName());
    }
}
