// 2884_알람 시계

import java.util.*;
import java.io.*;

public class Alarm_Clock_2884 {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if(H == 0 && M < 45) {
            H = 23;
            M = 60 + M - 45;
        }

        else if(M < 45) {
            H -= 1;
            M = 60 + M -45;
        }
        else {
            M = M - 45;
        }

        System.out.println(H+" "+M);
    }
}
