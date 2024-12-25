// Listing 2.11 do-while文の使用例
#include <stdio.h>

int main(void) {
    int x;

    do { 
        printf("Enter a positive integer: "); scanf("%d", &x);
        if (x <= 0) {
            printf("Input error!\n");
            continue;
        }
        break;
    } while(1);

    printf("You entered %d\n", x);
    
    return 0;
}