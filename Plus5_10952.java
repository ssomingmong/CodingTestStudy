// 10952_A+B-5

import java.util.*;
import java.io.*;

public class Plus5_10952 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            StringTokenizer st =  new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if(A == 0 && B == 0) break;
            else System.out.println(A + B);
        }
    }
}
