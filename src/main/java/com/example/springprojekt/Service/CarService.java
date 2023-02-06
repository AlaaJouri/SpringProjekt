package com.example.springprojekt.Service;

import com.example.springprojekt.Repository.CarReository;
import lombok.Data;

@Data
public class CarService {
    private  CarReository CarReository;

    public void addCar(String car){
        CarReository.addCar(car);

    }


}
