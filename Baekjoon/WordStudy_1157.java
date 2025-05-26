// 1157_단어 공부

import java.util.Scanner;

    public class WordStudy_1157 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String st = sc.nextLine().toUpperCase();

            int[] alpha = new int[26];

            for(int i = 0; i < st.length(); i++) {
                char ch = st.charAt(i);
                alpha[ch - 'A'] += 1;
            }

            int max = -1;
            char result = '?';
            
            for(int i = 0; i < 26; i++) {
                if(alpha[i] > max) {
                    max = alpha[i];
                    result = (char)(i + 'A');
                }
                else if(alpha[i] == max) result = '?';
            }

            System.out.println(result);
        }
    }
