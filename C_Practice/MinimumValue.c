#include <stdio.h>

int main(void) {
    int n = 0, sum = 0;
    while (sum <= 1000) {
        n++;
        sum += n * n;
    }
    printf("%d\n", n);
    return 0;
}
