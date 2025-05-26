
// 2444_별 찍기-7 

import java.util.Scanner;

public class Star7_2444 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 1; i <= N; i++) {
            for(int j = 0; j < N-i; j++) {
                System.out.print(" ");
            }

            for(int k = 0; k < i*2-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1; i <= N-1; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for(int k = 0; k < ((N-i)*2)-1 ; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        sc.close();
    }
}
