#include <stdio.h>

int checkPrime(int n);

int main(void) {
    printf("1에서 100 사이의 정수 중 소수 : ");

    for (int i = 1; i <= 100; i++) {
        if (checkPrime(i)) {
            printf("%d ", i);
        }
    }
    return 0;
}

int checkPrime(int n) {
    if (n < 2) {
        return 0;
    }

    for (int i = 2; i <= n / 2; i++) {
        if (n % i == 0) {
            return 0;
        }
    }

    return 1;
}
