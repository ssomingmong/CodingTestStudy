// 2675_문자열 반복

import java.util.*;
import java.io.*;

public class StringRepetition_2675 {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            String[] S = st.nextToken().split("");
            
            for(int j = 0; j < S.length; j++) {
                for(int k = 0; k < R; k++) {
                    System.out.print(S[j]);
                }
            }
            System.out.println();
        }
    }
}
