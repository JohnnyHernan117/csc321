// Johnny Hernandez
// lab 3

import java.util.Scanner;

public class jhernandez3
{
	public static void main(String[] args)
	{
		int x = 4, userNum = 0;
		double d = 7, userDouble = 0;
		char c = 'a', userChar = '.';
		float f = 1.1f, userFloat = 0.0f;
		System.out.println("Enter integer number");
		Scanner userInput = new Scanner(System.in);
		
		userNum = userInput.nextInt();

		System.out.println("Enter a decimal number(double)");
                userDouble = userInput.nextDouble();

		System.out.println("Enter a letter");
                userDouble = userInput.next().charAt(0);
		
		System.out.println("Enter another small decimal(float)");
                userDouble = userInput.nextFloat();

		//integer input
		if(userNum > x)
		{
			System.out.println("you entered " + userNum + " which is larger than my number " + x);	
		}
		else if(userNum < x)
		{
			System.out.println("you entered " + userNum + " which is smaller than my number " + x);
		}
		else
		{
			System.out.println("you entered " + userNum + " which is equals my number " + x);
		}

		//double input
		if(userDouble > d)
                {
                        System.out.println("you entered " + userDouble + " which is larger than my number " + d);
                }
                else if(userDouble < d)
                {
                        System.out.println("you entered " + userDouble + " which is smaller than my number " + d);
                }
                else
                {
                        System.out.println("you entered " + userDouble + " which is equals my number " + d);
                }

		//character input
		if(userChar != 'a')
                {
                        System.out.println("you entered " + userChar + " which is not my letter " + c);
                }
                else
                {
                        System.out.println("you entered " + userChar + " which is equal to my letter " + c);
                }
							
		//float input
		if(userFloat > f)
                {
                        System.out.printf("you entered %.1f which is larger than my number %.1f\n", f, userFloat);
                }
                else if(userFloat < f)
                {
			System.out.printf("you entered %.1f which is smaller than my number %.1f\n", f, userFloat);
                }
                else
                {
			System.out.printf("you entered %.1f which equals my number %.1f\n", f, userFloat);
                }

		for(int i = 0; i < 3; ++i)
        	{
                	System.out.println("Why did the car take a nap? it was tired...");
        	}

        	int i = 0;
        	while (i < 3)
        	{
                	System.out.println("Robocop");
			++i;
        	}
	}
}
