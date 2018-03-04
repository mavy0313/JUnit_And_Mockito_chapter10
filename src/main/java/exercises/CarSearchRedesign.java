package exercises;

import java.util.ArrayList;
import java.util.List;

public class CarSearchRedesign {

    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> findSportCars() {
        List<Car> sportCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.isSport()) {
                sportCars.add(car);
            }
        }
        return sportCars;
    }
}
