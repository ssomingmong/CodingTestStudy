#include <stdio.h>

void ft_a(int *a, int *b) {
    printf("\ndata = ");
    scanf("%d", a);
    printf("\ndata = ");
    scanf("%d", b);
}

int main() {
    int x, y;
    ft_a(&x, &y);
    printf("\n%d + %d = %d\n", x, y, x+y);
}