// 11382_꼬마 정민

import java.io.*;
import java.util.StringTokenizer;

public class LittlJeongmin_11382 {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        System.out.println((A + B + C));
    }
}