// Listing 3.8 関数呼び出しを含むCプログラム
#include <stdio.h>

int sum(int a, int b) {
    return a + b;
}

int main(void) {
    printf("%d\n", sum(2, 3));
    return 0;
}