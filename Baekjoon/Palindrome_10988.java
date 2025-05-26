// 10988_팰린드롬인지 확인하기

import java.util.Scanner;

public class Palindrome_10988 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] st = sc.nextLine().split("");
        String[] reverse = new String[st.length];

        for(int i = 0; i < reverse.length; i++) {
            reverse[i] = st[st.length-1-i];
        }
        
        int same = 0;
        
        for(int i = 0; i < reverse.length; i++) {
            if(st[i].equals(reverse[i])) same++;
            else continue;
        }

        if(same == reverse.length) System.out.println("1");
        else System.out.println("0");
        sc.close();
    }
}
