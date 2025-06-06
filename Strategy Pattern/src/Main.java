//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new NormalVehicle();
        Vehicle v2 = new SportsVehicle();
        Vehicle v3 = new OffRoadVehicle();

        v1.drive();
        v2.drive();
        v3.drive();
    }
}