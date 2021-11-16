#include <stdio.h>

int main() { 
    int vectors[5], evenAndAboveZero[5], evenCounter = 0;

    for (int counter = 0; counter < 5; counter++) {
    
        printf("Please enter a number: \n");
        scanf("%d", &vectors[counter]);

        if (vectors[counter] > 0 && vectors[counter] % 2 == 0) {
            evenAndAboveZero[evenCounter] = vectors[counter];
            evenCounter++;
        }

    }

    for (int counter = 0; counter < evenCounter; counter++) {
        
        printf("\n%d", evenAndAboveZero[counter]);
               
    }

    return 0;    
}