//Johnny Hernandez
//CSC-321
//Lab 4

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(void)
{
	int i, x = 7;
	double d = 10.5;
	char c = 'd';
	float f = 10.54;

	printf("The address of integer %d is %p\n", x, &x);
	printf("The address of character %c is %p\n", c, &c);
	printf("The address of double %0.1lf is %p\n", d, &d);
	printf("The address of float %0.2f is %p\n", f, &f);

	if(1)
	{
		int a = 10;
		//printf("The value of a inside the if block is %d\n", a);
	}
	printf("The value of a outside the if block %d\n", a);
	
	int arr[10] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

	for(i = 0; i < 10; ++i)
	{
		printf("The address of arr[%d] is %p\n", arr[i], &arr[i]);	
	}	

	return EXIT_SUCCESS;
}
