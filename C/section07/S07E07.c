#include <stdio.h>

int main() { 
    int mouseId;
    int mouseQuantity = 0, mouseState = 0, needsSphere = 0, needsCleaning = 0, needsCableOrConectorChange = 0, brokenOrUseless = 0;
    float needsSpherePercentage, needsCleaningPercentage, needsCableOrConectorChangePercentage, brokenOrUselessPercentage;

    printf("Please enter the mouse Id: \n");
    scanf("%d", &mouseId);

    while(mouseId != 0) {
        
        printf("Please enter the mouse state: \n1 - needs sphere.\n2 - needs cleaning.\n3 - needs cable or conector change.\n4 - It's broken or useless.\n");
        scanf("%d", &mouseState);

        if (mouseState <= 4 && mouseState >= 1) {
            if (mouseState == 1) {
            needsSphere += +1;
            } else if (mouseState == 2) {
            needsCleaning += +1;
            } else if (mouseState == 3) {
            needsCableOrConectorChange += +1;
            } else {
            brokenOrUseless += +1;
            }

            mouseQuantity++;
            printf("\nMouse state of ID %d saved succesfully.\n", mouseId);
        } else {
        printf("\nMouse state not found. Please try again.\n");
        }

    printf("Please enter the mouse Id: \n");
    scanf("%d", &mouseId);
        
    }
    
    if (mouseQuantity != 0) {
    needsSpherePercentage = ((float) needsSphere / (float) mouseQuantity * 100.0);
    needsCleaningPercentage = ((float) needsCleaning / (float) mouseQuantity * 100.0);
    needsCableOrConectorChangePercentage = ((float) needsCableOrConectorChange / (float) mouseQuantity * 100.0);
    brokenOrUselessPercentage = ((float) brokenOrUseless / (float) mouseQuantity * 100.0);
    }

    printf("\nMouse quantity: %d\n\n", mouseQuantity);
    printf("Mouse state  \t\t\t\t\tQuantity \t\tPercentage\n");
    printf("1 - Needs sphere  \t\t\t\t%d \t\t\t%.2f%%\n", needsSphere, needsSpherePercentage);
    printf("2 - Needs cleaning  \t\t\t\t%d \t\t\t%.2f%%\n", needsCleaning, needsCleaningPercentage);
    printf("3 - Needs cable or conector change \t\t%d \t\t\t%.2f%%\n", needsCableOrConectorChange, needsCableOrConectorChangePercentage);
    printf("4 - Broken or useless  \t\t\t\t%d \t\t\t%.2f%%\n", brokenOrUseless, brokenOrUselessPercentage);
    
    return 0;    
}