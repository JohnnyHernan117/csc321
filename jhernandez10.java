//Johnny Hernandez
//CSC 321
//Lab 10
import java.util.Scanner;

public class VolumeOfCylinder
{
        public static double calculateVolume(double radius, double height)
        {
                return Math.PI * Math.pow(radius, 2) * height;
        }

        public static void main(String[] args)
        {
                Scanner scanner= new Scanner(System.in);
                System.out.print("Enter Radius: ");
                double radius = scanner.nextDouble();

                System.out.print("Enter Height: ");
                double height = scanner.nextDouble();

                double volume = calculateVolume(radius, height);

                System.out.printf("The Volume of the Cylinder is: %.2f\n", volume);
        }
}
