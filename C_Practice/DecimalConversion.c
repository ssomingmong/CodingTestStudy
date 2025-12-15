#include <stdio.h>
#include <math.h>
#include <string.h>

int main(void) {
    char binary[64];
    int decimal = 0;

    printf("2진수를 입력하시오 : ");
    scanf("%s", binary);

    for(int i = 0; i < strlen(binary); i++) {
        if(binary[strlen(binary) - 1 - i] == '1') {
            decimal += pow(2, i);
        }
    }

    printf("10진수로 변환된 값 : %d", decimal);
}