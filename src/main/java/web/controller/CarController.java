package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarController {

    @GetMapping
    public String cars(@RequestParam(value = "count", required = false) String count, Model model) {
        CarService carService = new CarService();
        if ((count == null) || (Integer.parseInt(count) >= carService.getNumberOfAllCars())) {
            model.addAttribute("cars", carService.getCars(carService.getNumberOfAllCars()));
        } else {
            model.addAttribute("cars", carService.getCars(Integer.parseInt(count)));
        }
        return "cars";
    }
}
