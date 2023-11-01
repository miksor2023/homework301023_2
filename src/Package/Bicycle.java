package Package;

public class Bicycle extends Vehicle implements ServiceStation{
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void check() {//реализация метода, объявленного в интерфейсе ServiceStation
        this.repairWheels();
    }
}
