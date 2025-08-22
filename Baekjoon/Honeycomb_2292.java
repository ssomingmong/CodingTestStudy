//2292_벌집

import java.io.*;

public class Honeycomb_2292 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer   = 1;
        int max = 1;
      
        while(N > max) {
            max += 6 * answer;
            answer++;
        }

        System.out.println(answer);
    }
}
