package exercises;

import org.junit.Test;

import static exercises.Color.BLUE;
import static exercises.Color.RED;
import static org.fest.assertions.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CarImplTest {

    @Test
    public void shouldFindSportsCar() {
        Engine engine = mock(Engine.class);
        Manufacturer manufacturer = mock(Manufacturer.class);

        when(engine.getNbOfCylinders()).thenReturn(8);
        when(manufacturer.getName()).thenReturn("Ferrari");

        CarImpl carImpl = new CarImpl(engine, RED, manufacturer);

        CarSearchRedesign carSearchRedesign = new CarSearchRedesign();
        carSearchRedesign.addCar(carImpl);

        assertThat(carSearchRedesign.findSportCars()).isNotNull().containsExactly(carImpl);
    }

    @Test
    public void shouldNotFindSportsCar() {
        Engine engine = mock(Engine.class);
        Manufacturer manufacturer = mock(Manufacturer.class);

        when(engine.getNbOfCylinders()).thenReturn(6);
        when(manufacturer.getName()).thenReturn("Ferrari");

        CarImpl carImpl = new CarImpl(engine, BLUE, manufacturer);

        CarSearchRedesign carSearchRedesign = new CarSearchRedesign();
        carSearchRedesign.addCar(carImpl);

        assertThat(carSearchRedesign.findSportCars()).isNotNull().isEmpty();
    }
}
