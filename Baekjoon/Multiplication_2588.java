// 2588_곱셈

import java.io.*;

public class Multiplication_2588 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int b1 = b % 10;
        int b10 = (b / 10) % 10;
        int b100 = b / 100;

        System.out.println(a * b1);
        System.out.println(a * b10);
        System.out.println(a * b100);
        System.out.println(a * b);
    }    
}