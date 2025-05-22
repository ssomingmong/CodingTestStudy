// 10807_개수 세기

import java.util.*;
import java.io.*;

public class Counting_10807 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int v = Integer.parseInt(br.readLine());

        long count = Arrays.stream(numbers).filter(num -> num == v).count();

        System.out.println(count);
    }
    
}



