#include <stdio.h>

int main() { 
    int optionCode = 1;
    float numbers[5];

    while (optionCode != 0) {
        printf ("\nPlease enter the option code: \n2 - Show the vector in reversed as entered order.\n1 - Show the vector in the entered order.\n0 - Quit.\n");
        scanf("%d", &optionCode);

        if (optionCode == 2 || optionCode == 1) {
            for (int count = 0; count < 5; count++) {
            printf("Please enter a number: ");
            scanf("%f", &numbers[count]);
            }

            if (optionCode == 1) {
                printf("Showing the vector in the entered order: \n");
                for (int count = 0; count < 5; count++) {
                    printf("%.2f\n", numbers[count]);
                }
            } else if (optionCode == 2) {
                printf("Showing the vector in reversed as entered order: \n");
                for (int count = 4; count >= 0; count--) {
                    printf("%.2f\n", numbers[count]);
                }
            }
            
        } else if (optionCode == 0) {
            printf("You choose to quit.");
        } else {
            printf("Please enter a number between 0 and 2.\n");
        }
    }

    return 0;
}