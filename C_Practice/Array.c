#include <stdio.h>
#define N 10

int main() {
    FILE *fp;
    int i, n;
    
    fp = fopen("/Users/ssoming/Desktop/data.txt", "r");
    if (fp == NULL) {
        printf("파일을 열 수 없습니다.\n");
        return 1;
    }

    fscanf(fp, "%d", &n); 

    int x[n]; 
    for (i = 0; i < n; i++) {
        fscanf(fp, "%d", &x[i]);
    }

    for (i = 0; i < n; i++) {
        printf("%d ", x[i]);
    }

    printf("\n");
    fclose(fp);
    return 0;
}
