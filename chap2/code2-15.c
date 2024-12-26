// Listing 2.15 共用体の使用例
#include <stdio.h>
#include <stdint.h>

union EndianTest {
    u_int32_t i;
    u_int8_t bytes[4];
};


int main(void) {
    union EndianTest value;
    value.i = 0x01020304;
    printf("値（整数）: 0x%08X\n", value.i);

    if (value.bytes[0] == 0x01) {
        printf("ビッグエンディアン\n");
    } else if (value.bytes[3] == 0x01) {
        printf("リトルエンディアン\n");
    }

    // 個々のバイトにアクセス
    printf("バイト値: 0x%02x 0x%02x 0x%02x 0x%02x\n",
        value.bytes[0], value.bytes[1], value.bytes[2], value.bytes[3]);

    return 0;
}