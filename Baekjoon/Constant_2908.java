// 2908_상수    

import java.util.*;
import java.io.*;

public class Constant_2908 {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();
        
        String revA = new StringBuilder(A).reverse().toString();
        String revB = new StringBuilder(B).reverse().toString();

        int numA = Integer.parseInt(revA);
        int numB = Integer.parseInt(revB);

        System.out.println(Math.max(numA, numB));
    }
}
