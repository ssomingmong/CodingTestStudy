// 1152_단어의 개수

import java.util.Scanner;

public class NumberOfWords_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();

        if (input.isEmpty()) {
            System.out.println(0);
        } else {
            String[] st = input.split("\\s+");  // "\\s+"" : 공백 문자(띄어쓰기 + 탭 등) 하나 이상을 의미. 즉, 공백이 한 개든, 여러 개든 모두 하나의 구분자로 처리리 
            System.out.println(st.length);
        }

        sc.close();
    }
}
