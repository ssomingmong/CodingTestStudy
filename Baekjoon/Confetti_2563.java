// 2563_색종이

import java.util.*;
import java.io.*;

public class Confetti_2563 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int count = 0;

        int[][] drawingPaper = new int[100][100];
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int j = x; j < x + 10; j++) {
                for(int k = y; k < y + 10; k++) {
                    drawingPaper[k][j] = 1;
                }
            }
        }

        for(int i = 0; i < 100; i++) {
            for(int j = 0; j < 100; j++) {
                if(drawingPaper[i][j] == 1) count++;
            }
        }

        System.out.println(count);
    }
}
