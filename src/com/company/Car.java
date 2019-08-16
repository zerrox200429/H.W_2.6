package com.company;

public class Car implements Comparable<Car> {
    private String model;
    private int year;
    private double volume;



    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public double getVolume() {
        return volume;
    }

    public Car( String model,int year, double volume) {
        this.year = year;
        this.model = model;
        this.volume = volume;
    }
    @Override
    public  int compareTo(Car car){
        if(this.year< car.getYear()){
            return 1;

        }else if(this.year > car.getYear()){
            return  -1;

        }else {
            return 0;
        }
    }

}
