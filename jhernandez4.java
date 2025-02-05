//johnny Hernandez
//lab4
import java.util.Scanner;

public class jhernandez4
{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		int x = 0;
		
		System.out.println("Choose an option");
		System.out.println("Option 1");
		System.out.println("Option 2");
		System.out.println("Option 3");
		System.out.println("Option 4");

		x = userInput.nextInt();
		System.out.printf("You chose option %d\n", x);
	}
}	
