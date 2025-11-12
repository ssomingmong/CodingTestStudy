import java.util.*;
import java.io.*;

public class FlowerRoad_14620 {
    static int n;
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solution(arr);
    }

    public static void solution(int arr[][]) {
        for(int i = 1; i < n-1; i ++) {
            for(int j = 1 ; j < n-1; j++) {
                if(arr[i][j]) {

                }
            }
        }
    }
}
