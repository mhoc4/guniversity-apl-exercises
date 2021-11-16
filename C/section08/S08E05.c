#include <stdio.h>

int main() { 
    int vector[10], numbersAndIndexes[10][2], aboveFiftyCounter = 0;

    for (int count = 0; count < 10; count++) {
        printf("Please enter a number for the position %d/10: ", (count+1));
        scanf("%d", &vector[count]);

        if (vector[count] > 50) {
            numbersAndIndexes[aboveFiftyCounter][0] = vector[count];
            numbersAndIndexes[aboveFiftyCounter][1] = count;
            aboveFiftyCounter++;
        }
    }

    if (aboveFiftyCounter > 0) {
        for (int count = 0; count < aboveFiftyCounter; count++) {
            printf("\nThe number %d in the index %d is above 50.", numbersAndIndexes[count][0], (numbersAndIndexes[count][1]));
        }
    } else {
        printf("\nNo number above 50 was entered.");
    }

    return 0;
}