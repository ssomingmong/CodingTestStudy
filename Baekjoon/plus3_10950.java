// 10950_A+B-3

import java.util.*;
import java.io.*;

public class plus3_10950 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        int[] answer = new int[T];
        
        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            answer[i] = A + B;
        }

        for(int i = 0; i < T; i++) {
            System.out.println(answer[i]);
        }
    }
}
