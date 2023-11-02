package Package;

public class Car extends Vehicle{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    };
    public void checkk() {//реализация метода, объявленного в интерфейсе ServiceStation
        this.repairWheels();
        this.checkEngine();
    }
}