package de.neuefische;

public class OldTimer extends Car{
    int buildYear;

    public OldTimer(int amountOfTires, String color, String brand, int buildYear) {
        super(amountOfTires, color, brand);
        this.buildYear = buildYear;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    @Override
    public String toString() {
        return "OldTimer{" +
                "buildYear=" + buildYear +
                "} " + super.toString();
    }
}
