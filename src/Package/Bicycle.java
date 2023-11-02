package Package;

public class Bicycle extends Vehicle{
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkk() {
        this.repairWheels();
    }
}
