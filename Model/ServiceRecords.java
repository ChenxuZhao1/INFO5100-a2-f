/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author 85251
 */
public class ServiceRecords {

    private ArrayList<Car> records;

    public ServiceRecords() {
        this.records = new ArrayList<Car>();
    }

    public ArrayList<Car> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<Car> records) {
        this.records = records;
    }

//    public Car addNewCar() {
//        Car newCar = new Car();
//        records.add(newCar);
//        return newCar;
//    }
    public void addNewCar(Car car){
        records.add(car);
    }

    public void deleteRecords(Car selectedCars) {
        records.remove(selectedCars);
    }
}
