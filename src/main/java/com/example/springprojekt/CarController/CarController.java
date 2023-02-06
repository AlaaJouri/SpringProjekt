package com.example.springprojekt.CarController;

import com.example.springprojekt.Model.Car;
import com.example.springprojekt.Repository.CarReository;
import com.example.springprojekt.Service.CarService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/API")
public class CarController {
    private CarService CarService;
private CarService carService=new CarService();
    @PostMapping("/POST")
    public Car post(@RequestBody Car car) {
         carService.addCar(car);
         return car;
    }
    @GetMapping("/get")
    public CarReository get() {
        return carService.getCarReository();
    }

}
