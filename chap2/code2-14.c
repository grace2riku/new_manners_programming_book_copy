// Listing 2.14 構造体の配列の使用例
#include <stdio.h>
#define NUM 5

typedef struct {
    int score;
    char name[9];
} Student;


int main(void) {
    Student table[NUM] = {
        {80, "Alice"},
        {65, "Bob"},
        {70, "Caroline"},
        {93, "David"},
        {77, "Eve"}
    };

    for (int i = 0; i < NUM; i++) {
        printf("name: %-9s  score: %d\n", table[i].name, table[i].score);
    }

    return 0;
}