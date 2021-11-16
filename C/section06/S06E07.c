#include <stdio.h>
#include <stdbool.h>

int main() {
    int numbers[4];
    int squares[4];
    bool quit = false;

    printf("Please type the first number: \n");
    scanf("%d", &numbers[0]);

    printf("Please type the second number: \n");
    scanf("%d", &numbers[1]);

    printf("Please type the third number: \n");
    scanf("%d", &numbers[2]);

    printf("Please type the fourth number: \n");
    scanf("%d", &numbers[3]);

    for (int count = 0; count < 4; count++) {
        squares[count] = numbers[count] * numbers[count];
        if (count == 2 && squares[count] >= 1000) {
            printf("\n%d", squares[count]);
            quit = true;
            break;
        }        
    }

    if (quit == false) {
        for (int count = 0; count < 4; count++) {
        printf("Number: %d, Square: %d\n", numbers[count], squares[count]);
        }
    }

    return 0;
}