#include <stdio.h>

int main() {
    int minimalQuantity, maximumQuantity;
    float averageStock;
  
    printf("Please type the minimal quantity:\n");
    scanf("%d", &minimalQuantity);
 
    printf("Please type the maximum quantity:\n");
    scanf("%d", &maximumQuantity);

    averageStock = (minimalQuantity + maximumQuantity) / 2;

    printf("\nThe average stock is %.2f\n", averageStock);

    return 0;
}