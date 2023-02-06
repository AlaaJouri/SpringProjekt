package com.example.springprojekt.Service;

import com.example.springprojekt.Model.Car;
import com.example.springprojekt.Repository.CarReository;
import lombok.Data;

@Data
public class CarService {
    private  CarReository CarReository;

    public void addCar(Car car){
        CarReository.addCar(car);

    }


}
