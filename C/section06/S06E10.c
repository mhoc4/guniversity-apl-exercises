#include <stdio.h>
#include <stdbool.h>

int main() {
    int swimmerAge;

    printf("Please enter the swimmer's age. \n");
    scanf("%d", &swimmerAge);

    if (swimmerAge >= 18) {
        printf("\nThe swimmer is at adult category.\n");
    } else if (swimmerAge >= 14) {
        printf("\nThe swimmer is at juvenile-b category.\n");
    } else if (swimmerAge >= 12) {
        printf("\nThe swimmer is at juvenile-a category.\n");
    } else if (swimmerAge >= 8) {
        printf("\nThe swimmer is at child-b category.\n");
    } else {
        printf("\nThe swimmer is at child-a category.\n");
    }  

    return 0;
}