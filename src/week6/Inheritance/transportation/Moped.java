package week6.Inheritance.transportation;

public class Moped extends Vehicles{
    int speed;

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int speed){
        super(color,numberOfPassengers,cargoCapacity,fuelCapacity);
        this.speed = speed;
    }

}
