package com.example.springprojekt.CarController;

import com.example.springprojekt.Repository.CarReository;
import com.example.springprojekt.Service.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/API")
public class CarController {
    private CarService CarService;

    @GetMapping("/POST")
    public String post(@RequestBody String car) {
        return CarService.addCar(car);
    }
    @GetMapping("/get")
    public CarReository get() {
        return CarService.getCarReository();
    }
}
