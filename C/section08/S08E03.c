#include <stdio.h>

int main() { 
    int vector[10];

    for (int count = 0; count < 10; count++) {
        printf("Please enter a number: ");
        scanf("%d", &vector[count]);
    }

    for (int count = 9; count >= 0; count--) {
        printf("\n%d", vector[count]);
    }    

    return 0;    
}