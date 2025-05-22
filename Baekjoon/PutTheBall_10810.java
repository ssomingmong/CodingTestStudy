// 10810_공 넣기

import java.util.*;
import java.io.*;

public class PutTheBall_10810 {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        for(int a = 0; a < M; a++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            for(int b = i-1; b <= j-1; b++) {
                arr[b] = k;
            } 
        }

        for(int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
