#include <stdio.h>
#include <string.h>

int main() { 
    char login[100];
    char password[100];

    printf("Please enter your login: \n");
    gets(login);
        
    printf("Please enter your password: \n");
    gets(password);

    while(!strcmp(login, password)) {
        printf("\nYour password can't be the same as your login. \n");

        printf("Please enter your login: \n");
        gets(login);
        
        printf("Please enter your password: \n");
        gets(password);

    }

    printf("Login ok.");

    return 0;
}