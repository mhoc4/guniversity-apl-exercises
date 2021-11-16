#include <stdio.h>

int main() {
    float number;

    printf("Please type a number: \n");
    scanf("%f", &number);

    if (number > 100) {
        printf("\n%.2f", number);
    }
    else {
        number = 0;
        printf("\n%.0f", number);
    }

    return 0;
}