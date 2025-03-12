//johnny hernandez
//CSC321
//lab 9
import java.util.Random;
import java.util.Scanner;

public class GuessingGame{
	public static void main(String[] args){
		Random rand = new Random();
		int randInt = rand.nextInt(1, 20);
		Scanner scanner = new Scanner(System.in);
		int attempts = 3;

		System.out.println(randInt);

		while(attempts > 0){
			System.out.println("\nGuess a number between 1 - 20");
			System.out.printf("You have %d attempts left\n", attempts);

			if(!scanner.hasNextInt()){
				System.out.println("Invalid input! Input must be an integer");
				scanner.next();
				continue;
			}

			int userGuess = scanner.nextInt();
			if(userGuess < 1 || userGuess > 20){
				System.out.println("Invalid input! Input must be in range of 1 - 20");
				continue;
			}

			if(userGuess == randInt){
				System.out.println("You Won!");
				return;
			}else if(userGuess < randInt){
				System.out.println("Too low!");
			} else {
				System.out.println("Too high!");
			}
			attempts--;
		}
		System.out.println("Loser");
	}
}
