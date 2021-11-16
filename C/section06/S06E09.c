#include <stdio.h>
#include <stdbool.h>

int main() {
    float pollutionIndex;

    printf("Please enter the air pollution index value: \n");
    scanf("%f", &pollutionIndex);

    if (pollutionIndex >= 0.5) {
        printf("All industries must suspend their activities.");
    } else if (pollutionIndex >= 0.4) {
        printf("The industries of the first and second industry groups must suspend their activities.");
    } else if (pollutionIndex >= 0.3) {
        printf("Only the industries of the first industry group must suspend their activities.");
    } else {
        printf("The air pollution level is at an acceptable index.");
    }

    return 0;
}