//1193_분수찾기

import java.io.*;

public class FindTheFountain_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int line = 1;
        int sum = 0;

        while (sum < X) {
            sum += line;
            line++;
        }

        line--; 
        int diff = sum - X;
        int numerator, denominator;

        if (line % 2 == 0) {
            numerator = line - diff;
            denominator = 1 + diff;
        } else {
            numerator = 1 + diff;
            denominator = line - diff;
        }

        System.out.println(numerator + "/" + denominator);
    }
}
