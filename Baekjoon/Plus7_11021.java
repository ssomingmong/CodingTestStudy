// 11021_A+B-7

import java.io.*;
import java.util.StringTokenizer;

public class Plus7_11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int[] answer = new int[T];

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            answer[i] = A + B;
        }

        for (int j = 0; j < T; j++) {
            System.out.println("Case #" + (j + 1) + ": " + answer[j]);
        }
    }
}
