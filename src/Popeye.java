import java.text.DecimalFormat;
import java.util.Scanner;

public class Popeye {
  
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter how far in Nautical Miles your location is: ");

    double distance = scanner.nextDouble();

    double mile = 1.1508;

    double distant_result = distance * mile;

    System.out.println("Please enter the fastest knot your car can go: ");

    double fastest_knot = scanner.nextDouble();

    double fastest_time = distance/fastest_knot;

    System.out.println("Please enter the average knot your car can go: ");

    double average_knot = scanner.nextDouble();

    double average_time = distance/average_knot;


    DecimalFormat df = new DecimalFormat("#.##");
    System.out.println("Miles: " + df.format(distant_result));
    System.out.println("Fastest Time: " + df.format(fastest_time));
    System.out.println("Average Time: " + df.format(average_time));

  }
  
}
