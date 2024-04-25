package de.neuefische.circle;

public class Circle implements Shape{
    private int number;

    @Override
    public double calculateArea() {
        return 0;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
