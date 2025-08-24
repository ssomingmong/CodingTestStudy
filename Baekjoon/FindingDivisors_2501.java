//2501_약수 구하기

import java.io.*;
import java.util.StringTokenizer;

public class FindingDivisors_2501 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int count = 0;
        int answer = 0;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
                if (count == K) {
                    answer = i;
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}
