//Johnny Hernandez
//CSC321
//Lab 9
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    int randInt, userGuess;
    srand(time(NULL));
    randInt = (rand() % 20) + 1;

    printf("Guess a number between 1 through 20:\n");
    scanf("%d", &userGuess);

    if(userGuess < 0 || userGuess > 20){
        printf("You input a number that is out of range (1-20) re-enter a valid number\n");
    }

    else if(userGuess == randInt){
        printf("you won and guessed the number correctly!\n");
    }
    else if(userGuess < randInt){
        printf("you lost and your guess is lower than my number which is %d\n", randInt);
    }
    else if(userGuess > randInt){
        printf("you lost and your guess is greater than my number which is %d\n", randInt);
    }
    return 0;
}
