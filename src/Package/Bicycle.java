package Package;

public class Bicycle extends Vehicle{
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkk() {//реализация метода, объявленного в интерфейсе ServiceStation
        this.repairWheels();
    }
}
