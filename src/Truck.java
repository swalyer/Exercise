public class Truck extends Vehicle{
    private int playLoadCapasity = 0;



    public int getPlayLoadCapasity() {
        return playLoadCapasity;
    }

    public void setPlayLoadCapasity(int playLoadCapasity) {
        this.playLoadCapasity = playLoadCapasity;
    }

    public Truck(String model, int year, int playLoadCapasity) {
        super(model, year);
        this.playLoadCapasity = playLoadCapasity;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("playLoadCapasity:"+ playLoadCapasity);
}}