package exercises;

import org.junit.Test;

import static exercises.Color.BLUE;
import static exercises.Color.RED;
import static org.junit.Assert.assertEquals;
import static org.fest.assertions.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CarSearchTest {

    @Test
    public void shouldFindSportsCar() {
        Car car = mock(Car.class);
        Engine engine = mock(Engine.class);
        Manufacturer manufacturer = mock(Manufacturer.class);

        when(engine.getNbOfCylinders()).thenReturn(8);
        when(car.getEngine()).thenReturn(engine);
        when(car.getColor()).thenReturn(RED);
        when(car.getManufacturer()).thenReturn(manufacturer);
        when(manufacturer.getName()).thenReturn("Ferrari");

        CarSearch carSearch = new CarSearch();
        carSearch.addCar(car);

        assertEquals(car, carSearch.findSportCars().get(0));
    }

    @Test
    public void shouldNotFindSportsCarWith6Cylinders() {
        Car car = mock(Car.class);
        Engine engine = mock(Engine.class);
        Manufacturer manufacturer = mock(Manufacturer.class);

        when(engine.getNbOfCylinders()).thenReturn(6);
        when(car.getEngine()).thenReturn(engine);
        when(car.getColor()).thenReturn(RED);
        when(car.getManufacturer()).thenReturn(manufacturer);
        when(manufacturer.getName()).thenReturn("Ferrari");

        CarSearch carSearch = new CarSearch();
        carSearch.addCar(car);

        assertThat(carSearch.findSportCars()).isNotNull().isEmpty();
    }

    @Test
    public void shouldNotFindBlueSportsCar() {
        Car car = mock(Car.class);
        Engine engine = mock(Engine.class);
        Manufacturer manufacturer = mock(Manufacturer.class);

        when(engine.getNbOfCylinders()).thenReturn(8);
        when(car.getEngine()).thenReturn(engine);
        when(car.getColor()).thenReturn(BLUE);
        when(car.getManufacturer()).thenReturn(manufacturer);
        when(manufacturer.getName()).thenReturn("Ferrari");

        CarSearch carSearch = new CarSearch();
        carSearch.addCar(car);

        assertThat(carSearch.findSportCars()).isNotNull().isEmpty();
    }
}
