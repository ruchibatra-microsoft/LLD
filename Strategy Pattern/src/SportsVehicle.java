import strategy.SpecialDrive;

public class SportsVehicle extends Vehicle {
    SportsVehicle() {
        super(new SpecialDrive());
    }

    @Override
    void drive() {
        SpecialDrive obj = new SpecialDrive();
        obj.drive();

    }
}
