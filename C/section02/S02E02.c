#include <stdio.h>

int main() {
    int numberOne, numberTwo, result;

    printf("Please type the number one:\n");
    scanf("%d", &numberOne);
    
    printf("Please type the number two:\n");
    scanf("%d", &numberTwo);

    result = (numberOne + numberTwo) * numberOne;

    printf("\nThe result is %d\n", result);

    return 0;
}