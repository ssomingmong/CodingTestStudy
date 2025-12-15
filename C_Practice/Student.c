#include <stdio.h>

int main(void) {
    char name[20];
    char major[20];

    printf("학과를 입력하시오 : ");
    scanf("%s", major);
    printf("이름을 입력하시오 : ");
    scanf("%s", name);
    printf("------------------------\n");
    printf("학과: %s\n", major);
    printf("이름: %s\n", name);

    return 0;
}