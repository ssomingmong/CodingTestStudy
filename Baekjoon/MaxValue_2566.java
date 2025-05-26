// 2566_최댓값

import java.io.*;
import java.util.*;

public class MaxValue_2566 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] arr = new int[9][9];
        int max = -1;
        int[] maxLoc = new int[2];

        for(int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());

            for(int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());

                if(arr[i][j] > max) {
                    max = arr[i][j];
                    maxLoc[0] = i + 1;
                    maxLoc[1] = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(maxLoc[0] + " " + maxLoc[1]);
    }
}
