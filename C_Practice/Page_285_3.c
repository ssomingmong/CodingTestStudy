#include <stdio.h>

double average_calculation(int arr[], int n) {
    int sum = 0;
    double avg;

    for(int i = 0; i < n; i++) {
        sum += arr[i];
    }
    
    avg = sum / n;
    return avg;
}

int main() {
    int n;
    double avg;

    printf("배열의 크기를 입력하시오 : ");
    scanf("%d", &n);
    int arr[n];
    printf("\n배열의 원소를 정의하시오 : ");
    
    for(int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    
    avg = average_calculation(arr, n);

    printf("\n배열 원소들의 평균 = %.2f\n", avg);
}