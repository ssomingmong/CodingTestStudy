#include <stdio.h>

int main(int argc, char *argv[]) {
    int i;
    printf("The # of Command Line Arguments : %d\n", argc);
    printf("List of command Line Argumensts\n");
    for(i = 0; i < argc; i++) {
        printf("argv[%d] : %s\n", i, argv[i]);
    }
}