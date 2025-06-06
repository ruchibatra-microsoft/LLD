package strategy;

public class SpecialDrive implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("This is the special drive impl");
    }
}
