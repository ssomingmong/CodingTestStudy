// 11718_그대로 출력하기

import java.io.*;

public class PrintAsIs_11718 {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}
