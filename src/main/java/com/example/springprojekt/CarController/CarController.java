package com.example.springprojekt.CarController;

import com.example.springprojekt.Model.Car;
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
private CarService carService=new CarService();
    @GetMapping("/POST")
    public Car post(@RequestBody Car car) {
         CarService.addCar(car);
         return car;
    }
    @GetMapping("/get")
    public CarReository get() {
        return CarService.getCarReository();
    }
}
