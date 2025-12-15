#include <stdio.h>
#include <string.h>

int check_paasword(char *pw) {
    char *paddwd = "12345";
    static int count = 0;

    if(strcmp(pw, paddwd) == 0) {
        return 0;
    } else {
        count++;
        return 1;
    }
}

int main() {
    int again;
    char word[20];
    printf("패스워드를 입력하시오 : ");
    scanf("%s", word);
    
    again = check_paasword(word);
    if(again == 0) {
        printf("패스워드가 일치합니다.\n");
    } else {
        printf("패스워드가 일치하지 않습니다.\n");  
    }
}