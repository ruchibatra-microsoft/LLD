package strategy;

public class NormalDrive implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("This is the normal drive impl");
    }
}
