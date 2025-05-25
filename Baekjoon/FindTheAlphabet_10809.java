// 10809_알파벳 찾기

import java.util.Scanner;

public class FindTheAlphabet_10809 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        int[] answer = new int[26];

        for(int i = 0; i < 26; i++) {
            answer[i] = -1;
        }

        for(int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            int index = ch - 'a';
            if(answer[index] == -1) {
                answer[index] = i;
            }
        }

        for(int n : answer) System.out.print(n + " ");

        sc.close();
    }
}
