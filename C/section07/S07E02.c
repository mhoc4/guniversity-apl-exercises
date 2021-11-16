#include <stdio.h>
#include <stdbool.h>

int main() { 

    for (int count = 1; count <= 100; count++) {
        if (count % 10 == 0) {
            printf("\nMultiple of 10: %d.\n", count);
        }
    }

    return 0;
}