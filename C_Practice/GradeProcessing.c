#include <stdio.h>
#define N 10

int main() {
    FILE *fp;
    int id[N], score[N], rank[N], n;
    int i, j, limit, ranking, temp;

    fp = fopen("/Users/ssoming/Desktop/data.txt", "r");
    fscanf(fp, "%d", &n);
    for(i = 0; i < n; i++) {
        fscanf(fp , "%d %d", &id[i], &score[i]);
    }

    limit = n - 1;

    for(i = 0; i < limit; i++) {    
        for(j = i + 1; j < n; j++) {
            if(score[i] < score[j]) {
                temp = score[i];
                score[i] = score[j];
                score[j] = temp;

                temp = id[i];
                id[i] = id[j];
                id[j] = temp;
            }
        }
    }

    ranking = 1;
    rank[limit] = ranking;
    for(i = limit - 1; i >= 0; i--) {
        ranking++;
        if(score[i] == score[i + 1]) {
            rank[i] = rank[i + 1];
    }
    else {
        rank[i] = ranking;
    }
    }
    
    for(i = 0; i < n; i++) {
        printf("ID: %d, Score: %d, Rank: %d\n", id[i], score[i], rank[i]);
    }
    fclose(fp);
    return 0;
}