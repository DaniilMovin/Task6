package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
private final CarService carService ;
        @GetMapping("/cars")
        public String getCars(@RequestParam(value = "count",required = false) Integer count , ModelMap model){
            List<String> messages= new ArrayList<>();
            List<Car> cars = carService.getCarsByCount(count);
            for(Car car : cars){
                messages.add(car.toString());
            }
            model.addAttribute("messages", messages);
            return "cars";
        }

    public CarsController(CarService carService) {
        this.carService = carService;
    }
}
