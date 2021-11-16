#include <stdio.h>

int main() { 
    int firstVector[10], secondVector[10], sumResultVector[10];

    for (int count = 0; count < 10; count++) {
        printf("\nPlease enter a number for the first vector in the %d index: \n", count+1);
        scanf("%d", &firstVector[count]);

        printf("Please enter a number for the second vector in the %d index: \n", count+1);
        scanf("%d", &secondVector[count]);

        sumResultVector[count] = firstVector[count] + secondVector[count];
    }        

    for (int count = 0; count < 10; count++) {
        printf("\nThe sum result for the %d index is: %d", count+1, sumResultVector[count]);
    }

    return 0;    
}