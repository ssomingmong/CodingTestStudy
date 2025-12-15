#include <stdio.h>

char *find_blank(char *str) {
    while(*str) {
        if(*str == ' ') {
            return str;
        }
        str++;
    }
    return NULL;
}

int main() {
    char str[100];
    char *p;

    printf("문자열을 입력하시오 : ");
    fgets(str, sizeof(str), stdin);

    p = find_blank(str);

    if(p != NULL) printf("공백이 있습니다.");
    else printf("공백이 없습니다.");
}