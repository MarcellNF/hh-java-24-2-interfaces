package de.neuefische;

import de.neuefische.circle.Shape;

import java.util.Objects;

public class Car implements Vehicle, Shape {
    private int amountOfTires;
    private String color;
    private String brand;

    public Car(int amountOfTires, String color, String brand) {
        this.amountOfTires = amountOfTires;
        this.color = color;
        this.brand = brand;
    }


    public int getAmountOfTires() {
        return amountOfTires;
    }

    public void setAmountOfTires(int amountOfTires) {
        this.amountOfTires = amountOfTires;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "amountOfTires=" + amountOfTires +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return amountOfTires == car.amountOfTires && Objects.equals(color, car.color) && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountOfTires, color, brand);
    }

    @Override
    public void drive() {
        System.out.println("Das Auto fährt!");
    }

    @Override
    public void stop() {
        System.out.println("Das Auto bremst!");
    }

    @Override
    public double calculateArea() {
        return 0;
    }
}
