/*Johnny Hernandez
 *CSC 321
 *Midterm exam 1
 */
import java.util.Scanner;
import java.util.Random;

public class GuessingGame{
	public static void main(String[] args){
		Random random = new Random(); 
		Scanner scanner = new Scanner(System.in);
		boolean guessCorrectly = false;
		int randNum = random.nextInt(100) + 1;
		
		System.out.println("Guess a number from 1 - 100");

		while(!guessCorrectly){

                	int userGuess = scanner.nextInt();
			
			if(userGuess < randNum){
				System.out.println("Too low! Try again");
			}
			else if(userGuess > randNum){
				System.out.println("Too high! Guess again");
			}
			else{
				System.out.println("Congratulations! You won a car!");
				guessCorrectly = true;
			}
		}
	}
}
