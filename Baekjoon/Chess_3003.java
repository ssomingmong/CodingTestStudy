// 3003_킹, 퀸, 룩, 비숍, 나이트, 폰

import java.io.*;
import java.util.*;

public class Chess_3003 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());;
        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] myChess = new int[6];


        for(int i = 0; i < 6; i++) {
            myChess[i] = Integer.parseInt(st.nextToken());
        }
 
        for(int i = 0; i < 6; i++) {
            System.out.print(chess[i] - myChess[i] + " "); 
        }
        
         
    }
}
