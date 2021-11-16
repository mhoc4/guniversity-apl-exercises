#include <stdio.h>

int main() {
    int meters, centimeters;

    printf("Please type the meters value: \n");
    scanf("%d", &meters);

    centimeters = meters * 100;

    printf("\nThe value of %d meters to centimeters is %d centimeters\n", meters, centimeters);

    return 0;
}