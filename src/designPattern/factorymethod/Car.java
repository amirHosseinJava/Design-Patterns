package designPattern.factorymethod;

public class Car implements Vehicle{
    @Override
    public void showVehicleType() {
        System.out.println("Vehicle Type: Car");
    }
}
