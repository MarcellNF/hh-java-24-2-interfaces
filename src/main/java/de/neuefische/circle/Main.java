package de.neuefische.circle;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape square = new Square();

        System.out.println(circle.calculateArea() + " " + circle.getClass());
        System.out.println(square.calculateArea() + " " + square.getClass());
    }
}
