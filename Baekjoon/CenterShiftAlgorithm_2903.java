//2903_중앙 이동 알고리즘

import java.io.*;

public class CenterShiftAlgorithm_2903 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        int exponent = 1;
        
        for(int i = 0; i < N; i++) {
            exponent *= 2;
        }

        answer = (exponent+1) * (exponent+1);

        System.out.println(answer);
    }
}
