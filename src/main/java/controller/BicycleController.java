package controller;

import Model.Bicycle;
import Model.Bicycle;

public class BicycleController {

    public Bicycle addBIcycle(int gear, double speed){
        Bicycle bicycle=new Bicycle(gear, speed);
        return bicycle;
    }
}
