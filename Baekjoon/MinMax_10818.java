// 10818_최소, 최대

import java.io.*;
import java.util.*;

public class MinMax_10818 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());

            if(num < min) min = num;
            if(num > max) max = num;
        }
        System.out.println(min + " " + max);
    }   
}
