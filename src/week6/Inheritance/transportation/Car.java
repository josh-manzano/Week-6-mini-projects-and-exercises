package week6.Inheritance.transportation;

public class Car extends Vehicles {
    int speed;

     public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int speed){
         super(color,numberOfPassengers,cargoCapacity,fuelCapacity);
         this.speed = speed;
     }

    public int getSpeed() {
        return speed;
    }
}
