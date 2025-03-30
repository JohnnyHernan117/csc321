//Johnny Hernandez
//CSC 321
//Lab 11
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

double calculateHypotenuse(double height, double base){
        return sqrt(height * height + base * base);
}

int main(){
        double height, base, hypotenuse;
        printf("Enter the height of the right triangle:\n");
        scanf("%lf", &height);
        printf("Enter the base of the right traingle\n");
        scanf("%lf", &base);

        hypotenuse = calculateHypotenuse(height, base);

        printf("The resulting hypotenuse is: %.2lf\n", hypotenuse);

}
