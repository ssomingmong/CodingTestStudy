// 1546_평균

import java.io.*;
import java.util.*;

public class AverageManipulation_1546 {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        double[] subject = new double[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            subject[i] = Double.parseDouble(st.nextToken());
        }

        Arrays.sort(subject);
        double total = 0;

        for(int i = 0; i < N; i++) {
            total += (subject[i] / subject[N-1]) * 100;
        }

        System.out.println(total / N);
    }
}
