//2720_세탁소 사장 동혁

import java.io.*;

public class LaundryOwner_2720 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) {
            int C = Integer.parseInt(br.readLine());
            
            int q = C / 25;
            C %= 25;

            int d = C / 10;
            C %= 10;

            int n = C / 5;
            C %= 5;

            int p = C / 1;
            C %= 1;

            System.out.println(q + " " + d + " " + n + " " + p);
        }
        
    }
}
