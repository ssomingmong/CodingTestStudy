#include <stdio.h>
int main() {
    char *p, *q;
    p = q = "UNIX";
    while(*p) p++;
    while(p > q) {
        p--;
        putchar(*p);
    }

    putchar('\n');
}