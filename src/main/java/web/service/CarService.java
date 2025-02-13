package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Mercedes", "White", 34000));
        cars.add(new Car("BMW", "Black", 41000));
        cars.add(new Car("Ford", "Blue", 25000));
        cars.add(new Car("Toyota", "Grey", 28000));
        cars.add(new Car("Nissan", "Red", 12000));
    }

    public int getNumberOfAllCars() {
        return cars.size();
    }

    public List<Car> getCars(int count) {
        return cars.subList(0, count);
    }
}
