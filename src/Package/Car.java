package Package;

public class Car extends Vehicle implements ServiceStation{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void check() {//реализация метода, объявленного в интерфейсе ServiceStation
        this.repairWheels();
        this.checkEngine();
    }
}