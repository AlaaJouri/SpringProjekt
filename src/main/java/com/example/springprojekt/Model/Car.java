package com.example.springprojekt.Model;

import lombok.Data;

import java.util.ArrayList;
@Data
public class Car {
    private String Hersteller;
    ArrayList<Integer> Reifen = new ArrayList<Integer>();
    boolean Tuev=false;


}
