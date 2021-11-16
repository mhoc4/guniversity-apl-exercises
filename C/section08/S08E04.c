#include <stdio.h>

int main() { 
    int vector[20], sumOfVector;

    for (int count = 0; count < 20; count++) {
        printf("Please enter a number: ");
        scanf("%d", &vector[count]);

        sumOfVector += vector[count];
    }

    printf("The sum of all the entered numbers is %d", sumOfVector);

    return 0;    
}