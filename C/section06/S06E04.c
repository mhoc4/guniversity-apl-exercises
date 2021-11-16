#include <stdio.h>
#include <ctype.h>

int main() {
    float height;
    float result;
    char gender;

    printf("Please type a height: \n");
    scanf("%f", &height);

    gets(stdin); // input bug fix

    printf("Please type a gender f or m: \n");
    scanf("%c", &gender);

    if (tolower(gender) == 'm') {
        result = (72.7 * height) - 58;
        printf("\nThe ideal BMI for this height and gender is %.2f.", result);
    } else if (tolower(gender) == 'f') {
        result = (62.1 * height) - 44.7;
        printf("\nThe ideal BMI for this height and gender is %.2f.", result);
    } else {
        printf ("\ngender not found.");
    }

    return 0;
}