package web.service;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.List;
@Repository
public class CarServicelmp implements CarService {

    @Override
    public List<Car> getListCar(Integer count) {
        List<Car> listCar = Car.getListCar();
        if (count != null && count > 0 && count < 6) {
            return listCar.subList(0, count);
        } else {
            return listCar;
        }

    }
}
