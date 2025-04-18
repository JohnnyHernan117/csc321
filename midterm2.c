#include <stdio.h>

void printName(int);

int main(){
        int num;

        printf("Enter the number of times you want your name to print: ");
        scanf("%d", &num);

        printName(num);
}

void printName(int num){
        for(int i = 0; i < num; ++i){
                printf("johnny\n");
        }
}
