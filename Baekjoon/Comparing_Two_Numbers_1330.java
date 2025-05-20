// 1330_두 수 비교

import java.io.*;
import java.util.*;

public class Comparing_Two_Numbers_1330 {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if(A == B) System.out.println("==");
        if(A > B) System.out.println(">");
        if(A < B) System.out.println("<");
    }
}