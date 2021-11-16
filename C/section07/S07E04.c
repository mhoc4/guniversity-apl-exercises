#include <stdio.h>
#include <stdbool.h>

int main() { 
    int numbers[10], min, max;
    float average;

    printf("Please enter 10 integer and positive numbers.\n");
    scanf("%d", &numbers[0]);
    
    min = numbers[0];
    max = numbers[0];

    for (int count = 1; count < 10; count++) {
        printf("Please enter 10 integer and positive numbers.\n");
        scanf("%d", &numbers[count]);
        
        if (numbers[count] > max) {
            max = numbers[count];
        }
        if (numbers[count] < min) {
            min = numbers[count];
        }

        average += numbers[count];
    }

    average = average / 10;

    printf("The max number: %d\nThe min number: %d\nThe average number: %.2f", max, min, average);

    return 0;
}