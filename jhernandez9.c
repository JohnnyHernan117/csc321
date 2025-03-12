//johnny hernandez
//CSC 321
//Lab 9
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    int randInt, userGuess, attempts = 3;
    srand(time(0));
    randInt = (rand() % 20) + 1;

    printf("%d\n", randInt);

    while (attempts > 0) {

        printf("\nGuess a number between 1 - 20\n");
        printf("You have %d attempts left\n", attempts);

        if (scanf("%d", &userGuess) != 1) {

            printf("Invalid input! Input must be an integer\n");
            while (getchar() != '\n'); 
            continue;

        }

        if (userGuess < 1 || userGuess > 20) {

            printf("Invalid input! Input must be in range of 1 - 20\n");
            continue;

        }

        if (userGuess == randInt) {

            printf("You Won!\n");
            return 1;

        } else if (userGuess < randInt) {

            printf("Too low!\n");

        } else {

            printf("Too high!\n");

        }

        attempts--;

    }
    printf("Loser\n");

    return 0;
}

