// 2745_진법 변환

import java.util.Scanner;

public class BaseConversion_2745 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.next(); 
        int B = sc.nextInt(); 

        int result = 0;

        for (int i = 0; i < N.length(); i++) {
            char c = N.charAt(i);
            int value;

            if (c >= '0' && c <= '9') {
                value = c - '0';
            }

            else {
                value = c - 'A' + 10;
            }

            result = result * B + value;
        }

        System.out.println(result);
        sc.close();
    }
}
