package lesson;

public class Test {

    public static void main(String[] args) {
        Car carObj = new Car();
        carObj.setWheels(4);
        carObj.setColor("White");
        carObj.setFuel("Patrol");
        carObj.setDoors(2);
        System.out.println(carObj.getColor());
        System.out.println(carObj.getFuel());
        System.out.println(carObj.getDoors());
        System.out.println(carObj.getWheels());
        
        carObj.acclerate();
        carObj.brake();
        carObj.start();
        
    }
    
}
