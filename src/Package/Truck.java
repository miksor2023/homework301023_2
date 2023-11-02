package Package;


public class Truck extends Vehicle{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    public void checkk(){
        this.repairWheels();
        this.checkEngine();
        this.checkTrailer();
    }
}
