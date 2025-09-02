//9506_약수들의 합

import java.io.*;
import java.util.ArrayList;

public class SumOfDivisors_9506 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            int n = Integer.parseInt(br.readLine());
            
            if(n == -1) break;

            else {
                ArrayList<Integer> arr = new ArrayList<>();
                int pn = 0;
                for(int i = 1; i < n; i++) {
                    if(n % i == 0) {
                        arr.add(i);
                        pn += i;
                    }
                }

                if(pn == n) {

                    System.out.print(n + " = ");
                    for(int j = 0; j < arr.size(); j ++) {
                        System.out.print(arr.get(j));
                        if(j < arr.size() - 1) System.out.print(" + ");
                        else System.out.println();
                    }
                }

                else System.out.println(n + " is NOT perfect.");
                
            }
        }
    }
}
