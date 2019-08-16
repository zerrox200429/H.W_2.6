package com.company;


import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList <Car> cars = new ArrayList<>(10);

        cars.add(new Car("Acura", 2018, 4.0));
        cars.add(new Car("Bugatti", 2010, 5.8));
        cars.add(new Car("Buick", 2011, 4.4));
        cars.add(new Car("Cadilac", 2006, 5.5));
        cars.add(new Car("Audi", 1991, 2.3));
        cars.add(new Car("Cherry", 2008, 3.0));
        cars.add(new Car("Porshe", 2002, 5.3));
        cars.add(new Car("Bentley", 2013, 4.5));
        cars.add(new Car("BMW", 1993, 2.5));
        cars.add(new Car("Ford", 2019, 5.3));

        System.out.println("До сортировки");
        for (Car car : cars) {
            System.out.println(" Модель машины- (" + car.getModel() + ")" +
                    " Год выпуска машины -(" + car.getYear() + ")" +
                    " Обьем двигателя :" + car.getVolume() + ")");
        }

        Collections.sort(cars);
        System.out.println("После сортировки");
        for (Car car : cars) {
            System.out.println(" Модель машины- (" + car.getModel() + ")" +
                    " Год выпуска машины -(" + car.getYear() + ")" +
                    " Обьем двигателя :" + car.getVolume() + ")");
        }
    }
}


















