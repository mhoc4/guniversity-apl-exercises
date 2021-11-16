#include <stdio.h>
#include <stdbool.h>

int main() {
    int number;
    int biggestNumber = 0;

    while(number != 0) {
    printf("Please enter an integer number: ");
    scanf("%d", &number);
    if (number > biggestNumber) {
        biggestNumber = number;
    }
}   
    printf("The biggest number was %d.", biggestNumber);

    return 0;
}