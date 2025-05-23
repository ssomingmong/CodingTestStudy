// 5596_과제 안 내신 분..?

import java.io.*;
import java.util.Arrays;

public class NoAssignment_5597 {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] students = new int[30];
        for(int i = 0; i < students.length; i++) {
            students[i] = i + 1;
        }
        
        int[] arr = new int[28];
        int a = 0;
        for(int i = 0; i < 28; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            a += arr[i];            
        }
        Arrays.sort(arr);
        int[] answer = new int[2];
        for(int i = 0; i < 28; i++) {
            if(students[i] - arr[i] != 0) {
                answer[0] = i+1; 
                break;
            }
        }

        System.out.println(answer[0]);
        System.out.println(465 - a - answer[0]);
    }
}

