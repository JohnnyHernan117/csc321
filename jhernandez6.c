//johnny hernandez
//csc321
//lab 6
#include <stdio.h>
#include <stdlib.h>

int main()
{
        int x = 7, y = 9;
        double z = 7.0, w = 9.0;

        int int_result_1 = x + y * x / y - x;
        int int_result_2 = -x - y / x * y + x;
        int int_result_3 = x + y - x / y;

        printf("Result of x + y * x / y - x:\t%d\n", int_result_1);
        printf("Result of -x - y / x * y + x:\t%d\n", int_result_2);
        printf("Result of x + y - x / y:\t%d\n", int_result_3);

        double double_result_1 = z + w * z / w - z;
        double double_result_2 = -z - w / z * w + z;
        double double_result_3 = z + w - z / w;

        printf("Result of x + y * x / y - x:\t%lf\n", double_result_1);
        printf("Result of -x - y / x * y + x:\t%lf\n", double_result_2);
        printf("Result of x + y - x / y:\t%lf\n", double_result_3);
}
