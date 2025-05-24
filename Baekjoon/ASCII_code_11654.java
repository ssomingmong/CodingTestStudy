// 11654_아스키 코드

import java.io.*;

public class ASCII_code_11654 {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char i = br.readLine().charAt(0);

        System.out.println((int)i);
    }
}