package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String Car(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> listCar = new ArrayList<>();
        listCar.add(new Car("BMV", "218",2018));
        listCar.add(new Car("Mercedes", "CL",2020));
        listCar.add(new Car("OPEL", "ASTRA",2017));
        listCar.add(new Car("MAZDA", "DEMIO",2002));
        listCar.add(new Car("MAZDA", "3",2013));
        model.addAttribute("cars", listCar);
        try {
            if (count != null) {
                model.addAttribute("cars", listCar.subList(0, count));
            }
        } catch (IndexOutOfBoundsException ex){
            model.addAttribute("cars", listCar);
        }
        return "cars";
    }
}
