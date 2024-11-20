public class Car extends Vehicle{
    private int trunkSize;



    public int getTrunkSize() {
        return trunkSize;
    }

    public void setTrunkSize(int trunkSize) {
        this.trunkSize = trunkSize;
    }

    public Car(String model, int year, int trunkSize) {
        super(model, year);
        this.trunkSize = trunkSize;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Model: " + trunkSize);
}}
