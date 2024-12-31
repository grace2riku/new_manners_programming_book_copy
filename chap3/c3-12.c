// Listing 3.12 動的メモリ確保を行うCプログラム
#include <stdio.h>
#include <stdlib.h>

int main(void) {
    int *p = malloc(sizeof(int));
    *p = 5;
    printf("%d\n", *p);
    free(p);
    return 0;
}