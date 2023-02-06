package com.example.springprojekt.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
@Data
@AllArgsConstructor
public class Car {
    private String Hersteller;
    ArrayList<Integer> Reifen = new ArrayList<Integer>();
    boolean Tuev=false;


}
