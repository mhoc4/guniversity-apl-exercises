#include <stdio.h>
#include <stdbool.h>

int main() { 

    for (int count = 100; count <= 200; count++) {
        if (count % 2 != 0) {
            printf("\nOdd number: \n%d", count);
        }
    }

    return 0;
}