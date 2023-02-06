package com.example.springprojekt.Repository;

import com.example.springprojekt.Model.Car;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Data

public class CarReository {
    List<Car> Cars=new ArrayList<Car>();

   public List<Car>listCar(){
       return Cars;
   }


    public void add(Car car) {
        Cars.add(car);
    }
}
