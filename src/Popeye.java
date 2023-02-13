import java.text.DecimalFormat;
import java.util.Scanner;

public class Popeye {
  
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the distance to travel in nautical miles: ");

    double distance = scanner.nextDouble();

    double mile = 1.1508;

    double distant_result = distance * mile;

    System.out.println("Please enter the top speed of the boat in knots: ");

    double fastest_knot = scanner.nextDouble();

    double fastest_time = distance/fastest_knot;

    System.out.println("Please enter the average speed of the boat in knots: ");

    double average_knot = scanner.nextDouble();

    double average_time = distance/average_knot;


    DecimalFormat df = new DecimalFormat("#.##");
    System.out.println("The distance to travel in regular miles is: " + df.format(distant_result) + " miles.");
    System.out.println("The best case travel time is: " + df.format(fastest_time) + " hours at " + fastest_knot + " knots.");
    System.out.println("The average case travel time is: " + df.format(average_time) + " hours at " + average_knot + " knots.");

  }
  
}
