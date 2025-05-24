// 9086_문자열

import java.util.Scanner;

    public class String_9086 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int T = sc.nextInt();
            sc.nextLine();

            for(int i = 0; i < T; i++) {
                String string = sc.nextLine();
                if(string.length() == 1) {
                    System.out.println(string + string);
                }
                else {
                    System.out.println(string.charAt(0)+""+ string.charAt(string.length() - 1));
                }
            }
            
        }
    }
