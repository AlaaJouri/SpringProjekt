package com.example.springprojekt.Repository;

import com.example.springprojekt.Model.Car;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data

public class CarReository {
    List<Car> Cars=new ArrayList<Car>();

   public List<Car>listCar(){
       return Cars;
   }


    public void addCar(Car car) {
        Cars.add(car);
    }
}
