#include <stdio.h>

int main() {
    float numberInput, negativeNumber, positiveNumber;

    printf("Please type a number: \n");
    scanf("%f", &numberInput);

    if (numberInput < 0) {
        negativeNumber = numberInput;
        printf("\nNegative number \n%.2f", negativeNumber);
    }
    else if (numberInput > 0) {
        positiveNumber = numberInput;
        printf("\nPositive number \n%.2f", positiveNumber);
    } else {
        printf("\nThe number is zero\n%.2f", numberInput);
    }

    return 0;
}