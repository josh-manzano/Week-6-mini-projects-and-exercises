package week6.Inheritance.AssetManagerPractice;

import java.time.LocalDate;

public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public double getValue(){
        int yrsOld = LocalDate.now().getYear() - year;
        double reduce = 0;
        if(yrsOld <= 3){
            reduce = 0.03;
        }else if(yrsOld <= 6 ){
            reduce = 0.06;
        } else  if(yrsOld <= 10){
            reduce = 0.08;
        }
        return calculatePrice(yrsOld, reduce);

    }

    public double calculatePrice(int yearsOld, double reduce){
        double baseCost = getOriginalCost() * (1- yearsOld * reduce);
        boolean isHighMileage = getOdometer() > 100000 && !makeModel.contains("Honda") &&  makeModel.contains("Toyota");
        if(isHighMileage && yearsOld > 10){
                return 750;
            }else if (yearsOld > 10){
                return 1000;
            }
        if(isHighMileage){
            baseCost *= 0.75;
        }
        return baseCost;
    }

}
