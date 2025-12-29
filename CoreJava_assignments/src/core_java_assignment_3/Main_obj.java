package core_java_assignment_3;
import java.util.Scanner;

public class Main_obj {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        int hours = sc.nextInt();
        double costPerHour = sc.nextDouble();

        Airfare airfare = null;

        if (choice == 1) {
            airfare = new AirIndia(hours, costPerHour);
        } else if (choice == 2) {
            airfare = new KingFisher(hours, costPerHour);
        } else if (choice == 3) {
            airfare = new Indigo(hours, costPerHour);
        }

        airfare.display();
        sc.close();
    }
}
