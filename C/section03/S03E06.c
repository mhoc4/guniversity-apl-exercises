#include <stdio.h>

int main() {
    float hourlyWage, totalWage;
    int totalWorkedHours;

    printf("Please type the hourly wage: \n");
    scanf("%f", &hourlyWage);
    
    printf("Please type the total worked hours: \n");
    scanf("%d", &totalWorkedHours);

    totalWage = hourlyWage * totalWorkedHours;

    printf("\nThe total wage is %.2f\n", totalWage);

    return 0;
}