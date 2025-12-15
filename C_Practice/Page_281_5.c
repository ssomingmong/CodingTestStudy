#include <stdio.h>

void sum(int *from, int *to, int *result) {
    for(int i = *from; i <= *to; i++) {
        *result += i;
    }
}

int main() {
    int m, n, total = 0;
    printf("두 정수를 작은 수부터 입력하시오 : ");
    scanf("%d %d", &m ,&n);
    sum(&m, &n, &total);
    printf("%d 부터 %d까지의 합 : ", m, n);
    printf("%d\n", total);
}