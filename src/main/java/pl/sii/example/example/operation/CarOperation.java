package pl.sii.example.example.operation;

import pl.sii.example.example.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarOperation {

    public List<Car> resolveCarsByManufacturer(String manufacturer) {
        return null;
    }

    public List<String> resolveManufacturersOfCarsWithMaxSpeed(Double maxSpeed) {
        return null;
    }

    public List<Car> createDummyCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Skoda", "Octavia", 210.6));
        cars.add(new Car("Fiat", "Uno", 130.0));
        cars.add(new Car("Lada", "Samara", 152.3));
        cars.add(new Car("Fiat", "Punto", 135.1));
        cars.add(new Car("Skoda", "Fabia", 195.3));
        return cars;
    }
}
