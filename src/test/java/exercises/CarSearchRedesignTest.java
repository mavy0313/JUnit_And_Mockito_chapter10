package exercises;

import org.junit.Test;

import static exercises.Color.BLUE;
import static exercises.Color.RED;
import static org.fest.assertions.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CarSearchRedesignTest {

    @Test
    public void shouldFindSportsCar() {
        Car car = mock(Car.class);

        when(car.isSport()).thenReturn(true);

        CarSearchRedesign carSearchRedesign = new CarSearchRedesign();
        carSearchRedesign.addCar(car);

        assertThat(carSearchRedesign.findSportCars()).isNotNull().containsExactly(car);
    }

    @Test
    public void shouldNotFindSportsCar() {
        Car car = mock(Car.class);

        when(car.isSport()).thenReturn(false);

        CarSearchRedesign carSearchRedesign = new CarSearchRedesign();
        carSearchRedesign.addCar(car);

        assertThat(carSearchRedesign.findSportCars()).isNotNull().isEmpty();
    }
}
