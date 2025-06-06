import strategy.NormalDrive;

public class NormalVehicle extends Vehicle{
    NormalVehicle() {
        super(new NormalDrive());
    }
    @Override
    void drive() {
        super.drive();
    }
}
