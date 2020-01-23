
package lesson;

public class Vehicle {
    private int wheels;
    private String color;
    private String fuel;
    private double speed;
public void setWheels(int wheels)
{
this.wheels = wheels;
}
public int getWheels()
{
return this.wheels; 
}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
public void start()
{
    System.out.println("The Vehicle is starting");
}
public void acclerate()
{
    System.out.println("Vehicle is accelerating ");
}
public void brake()
{
    System.out.println("Vehicle is stoping");
}
}