#include <stdio.h>
#include <ctype.h>

int main() {
    int employeeCode, workedHours, regularWage, overtimeWage = 0;
    const int REGULAR_WAGE_PER_HOUR = 10;
    const int OVERTIME_WAGE_PER_HOUR = 20;

    printf("Please type the employee code: \n");
    scanf("%d", &employeeCode);

    printf("Please type the amount of total worked time in hours: \n");
    scanf("%d", &workedHours);

    if (workedHours > 50) {
        regularWage = REGULAR_WAGE_PER_HOUR * 50;
        overtimeWage = (workedHours - 50) * OVERTIME_WAGE_PER_HOUR;
        regularWage += overtimeWage;
    } else {
        regularWage = REGULAR_WAGE_PER_HOUR * workedHours;
    }

    printf("\nEmployee code %d\nTotal wage: R$ %d,00\nOvertime wage: R$ %d,00\n",
     employeeCode, regularWage, overtimeWage);


    return 0;
}