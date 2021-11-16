#include <stdio.h>
#include <ctype.h>

int main() {
    float totalFishCaughtWeight, totalWeightOverLimit;
    int fineToPay = 0;
    const int FINE_VALUE = 4;

    printf("Please type the total fish caught weight value: \n");
    scanf("%f", &totalFishCaughtWeight);

    if (totalFishCaughtWeight > 50) {
        totalWeightOverLimit = totalFishCaughtWeight - 50;
        fineToPay = ((int) totalFishCaughtWeight - 50) * FINE_VALUE;
    }

    printf("\nTotal Fish Caught Weight: %.2f", totalFishCaughtWeight);
    printf("\nTotal Weight Overlimit: %.2f", totalWeightOverLimit);
    printf("\nTotal Fine to pay: R$ %d,00", fineToPay);

    return 0;
}