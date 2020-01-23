package lesson;

public class Car extends PassengerVehicle{
  private int doors;

    public int getDoors() {
        System.out.println(this.doors);
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
  
}
