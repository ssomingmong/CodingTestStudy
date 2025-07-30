//11005_진법 변환2

import java.io.*;
import java.util.*;

public class BaseConversion_11005 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        StringBuilder result = new StringBuilder();

        while(N > 0) {
            int remainder = N % B;

            if(remainder < 10) {
            result.append(remainder);
        } else {
            result.append((char)('A' + (remainder - 10)));
        }

        N /= B;
        }
        System.out.println(result.reverse().toString());
    }
}
