package week6.Inheritance.transportation;

public class SemiTruck extends Vehicles{

    int speed;

    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int speed){
        super(color,numberOfPassengers,cargoCapacity,fuelCapacity);
        this.speed = speed;
    }

}
