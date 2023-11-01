package Package;


public class Truck extends Vehicle implements ServiceStation{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    public void check() {//реализация метода, объявленного в интерфейсе ServiceStation
        this.repairWheels();
        this.checkEngine();
        this.checkTrailer();
    }
}
