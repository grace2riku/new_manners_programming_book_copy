// Listing 3.17 静的領域、スタック領域、定数領域の例
#include <stdio.h>

char g[] = "123";

int main(void) {
    char s[] = "ABC";
    char* p = "XYZ";
    printf("%s %s %s\n", g, s, p);
    return 0;
}