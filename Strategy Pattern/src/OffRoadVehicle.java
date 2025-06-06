import strategy.SpecialDrive;

public class OffRoadVehicle extends Vehicle {
    OffRoadVehicle() {
        super(new SpecialDrive());
    }

    @Override
    void drive() {
        super.drive();
    }
}
