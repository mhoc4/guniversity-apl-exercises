#include <stdio.h>

int main() {
    float personHeight, idealBMI;

    printf("Please type the height value: \n");
    scanf("%f", &personHeight);
    
    idealBMI = (72.7 * personHeight) - 58;

    printf("The ideal BMI value for this height is %.2f", idealBMI);

    return 0;
}