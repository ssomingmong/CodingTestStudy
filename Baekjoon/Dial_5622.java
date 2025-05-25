// 5622_다이얼

import  java.io.*;

public class Dial_5622 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        int total = 0;

        for(int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);

            if (ch >= 'A' && ch <= 'C') total += 3;
            else if (ch >= 'D' && ch <= 'F') total += 4;
            else if (ch >= 'G' && ch <= 'I') total += 5;
            else if (ch >= 'J' && ch <= 'L') total += 6;
            else if (ch >= 'M' && ch <= 'O') total += 7;
            else if (ch >= 'P' && ch <= 'S') total += 8;
            else if (ch >= 'T' && ch <= 'V') total += 9;
            else if (ch >= 'W' && ch <= 'Z') total += 10;
        }
        System.out.println(total);
    }
}
