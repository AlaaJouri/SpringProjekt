package com.example.springprojekt.Service;

import com.example.springprojekt.Model.Car;
import com.example.springprojekt.Repository.CarReository;
import lombok.Data;

@Data
public class CarService {
    private  CarReository carReository=new CarReository();

    public void addCar(Car car){
        carReository.addCar(car);

    }


}
