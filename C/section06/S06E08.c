#include <stdio.h>
#include <stdbool.h>

int main() {
    int number;

    printf("Please enter an integer number: \n");
    scanf("%d", &number);

    if (number % 2 == 0) {
        if (number > 0) {
        printf("\nThe number is even and positive.\n");
        } else {
            printf("\nThe number is even and negative.\n");
        }
    } else {
        if (number > 0) {
        printf("\nThe number is odd and positive.\n");
        } else {
            printf("\nThe number is odd and negative.\n");
        }
    }

    return 0;
}