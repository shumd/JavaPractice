package IDE_ClassWork;

import FromTaskBook.Point;

public class Car {
    private final String vin;

    private Point coordinate;

    private static final float LITRES_IN_GALLON = 4.54f;
    private final String model;
    private final float fuelUsage; // на 1 км
    private final float tankSize;
    private float engineSize = 0;
    private  float fuel;


    public String getVin() {
        return vin;
    }

    public String getModel() {
        return model;
    }

    public float getEngineSize(){
        return engineSize;
    }

    public float getTankSize() {
        return tankSize;
    }

    public float getFuelLit() {
        return fuel;
    }

    public float getFuelGal(){
        return fuel/ LITRES_IN_GALLON;
    }

    public float getFuelUsage() {
        return fuelUsage;
    }


    public Car(String vin, String model, float engineSize, float tankSize){
        this.vin = vin;
        this.model = model;
        this.engineSize = engineSize > 0 ? engineSize : 2.5f;
        fuel = tankSize;
        this.tankSize = tankSize > 0 ? tankSize : 40;
        fuelUsage = engineSize > 1.2 ? engineSize*0.065f : 0.08f;
    }

    public void ride(int distance){
        if (distance*fuelUsage > fuel){
            System.out.println("Вы проехали " + fuel/fuelUsage + " из " + distance +
                    "\nУ вас закончился бензин");
            fuel = 0;
        }else {
            fuel -= fuelUsage*distance;
            System.out.println("Дистанция в " + distance + "км успешно преодолена" +
                    "\nУ вас осталось " + fuel + "л в баке\n");
        }
    }

    public void fillTank(float amount){
        if (amount < 0){
            throw new IllegalArgumentException();
        }
        if (amount > tankSize-fuel){
            throw new IndexOutOfBoundsException();
        }
        fuel += amount;
        System.out.println("Вы заправили " + amount + "л." +
                "\nВ баке " + fuel + "л.\n");
    }

    public float getFreeTankSpace(){
        return tankSize-fuel;
    }

    @Override
    public String toString() {
        return (vin + " " + model);
    }

    public Point getCurrentCoordinate(){
        return coordinate;
    }

}
