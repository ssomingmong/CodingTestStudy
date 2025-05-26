// 2941_크로아티아 알파벳

import java.util.Scanner;

public class CroatianAlphabet_2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] croation = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String st = sc.nextLine();
        
        for(String c : croation) {
            st = st.replace(c,"*");
        }

        System.out.println(st.length());
        sc.close();
    }
}