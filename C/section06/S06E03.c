#include <stdio.h>

int main() {
    int number;
    int pair = 0;
    int unpair = 0;

    printf("Please type a number: \n");
    scanf("%d", &number);

    if (number % 2 == 0) {
        pair = number;
    } else {
        unpair = number;
    }
    printf("\n%d\n%d", pair, unpair);

    return 0;
}