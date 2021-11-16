#include <stdio.h>

int main() { 
    int number;

    printf("Please enter the number you wish to calculate from 1 to 10.\n");
    scanf("%d", &number);

    while(number > 10 || number < 1) {
        printf("The number must be between 1 and 10. \n");
        printf("Please enter the number you wish to calculate from 1 to 10.\n");
    scanf("%d", &number);
    }

    for (int count = 1; count <= 10; count++) {
        printf("\n%d X %d = %d", number, count, number * count);
    }

    return 0;    
}