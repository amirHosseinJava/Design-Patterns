package designPattern.abstractfactory2;

public abstract class AbstractFactory {
    abstract Car getCar(Car car);
    abstract MotorCycle getMotorCycle(MotorCycle motorCycle);
}
