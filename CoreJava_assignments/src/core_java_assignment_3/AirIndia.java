package core_java_assignment_3;


public class AirIndia implements Airfare {

    private int hours;
    private double costPerHour;

    // Default constructor
    public AirIndia() {
    }

    // Parameterized constructor
    public AirIndia(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    // Getters and Setters
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(double costPerHour) {
        this.costPerHour = costPerHour;
    }

    // Calculate amount
    public double calculateAmount() {
        return hours * costPerHour;
    }

    public void display() {
        System.out.printf("%.2f", calculateAmount());
    }
}
