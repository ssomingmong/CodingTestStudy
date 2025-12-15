#include <stdio.h>
#define N 10

int main() {
    int i, j, temp;
    int x[N] = {3,1,5,4,7,8,6,9,0,2};

    for (i = 0; i < N - 1; i++) {
        for (j = i + 1; j < N; j++) {
            if (x[i] > x[j]) {
                temp = x[i];
                x[i] = x[j];
                x[j] = temp;
            }
        }
    }
    for (i = 0; i < N; i++) {
        printf("%d ", x[i]);
    }
    printf("\n");
    return 0;
}