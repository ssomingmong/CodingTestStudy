// 10798_세로 읽기

import java.io.*;

public class VerticalReading_10798 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[5][15];

        for(int i = 0; i < 5; i++) {
            String line = br.readLine();
            for(int j = 0; j < line.length(); j++) {
                arr[i][j] = line.charAt(j);
            }
        }
        
        StringBuilder sb = new StringBuilder();

        for(int j = 0; j < 15; j ++) {
            for (int i = 0; i < 5; i++) {
                if(arr[i][j] != '\0') {
                    sb.append(arr[i][j]);
                }
            }
        }

        System.out.println(sb);
    }
}
