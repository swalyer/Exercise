public class Vehicle {

    private String model;
    private int year;


    public Vehicle (String model, int year){
        this.model = model;
        this.year = year;
    }
    public String getModel(){
        return model;
    }
    void setModel(String model){
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void displayDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}