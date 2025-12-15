#include <stdio.h>

void chage2(int *x) {
    *x = 3;
}

void chage(int *x) {
    chage2(*x);
}

int main() {
    int x;
    chage(&x);
    printf("x = %d\n", x);
}