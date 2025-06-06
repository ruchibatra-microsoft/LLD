import strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy obj;
    Vehicle(DriveStrategy obj){
        this.obj = obj;
    }
    void drive(){
        obj.drive();
    }
}
