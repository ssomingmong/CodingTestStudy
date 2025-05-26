// 25206_너의 평점은

import java.io.*;
import java.util.*;

public class YourRating_25206 {
    @SuppressWarnings("unused")
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        HashMap<String, Double> gradeMap = new HashMap<>();
        gradeMap.put("A+", 4.5);
        gradeMap.put("A0", 4.0);
        gradeMap.put("B+", 3.5);
        gradeMap.put("B0", 3.0);
        gradeMap.put("C+", 2.5);
        gradeMap.put("C0", 2.0);
        gradeMap.put("D+", 1.5);
        gradeMap.put("D0", 1.0);
        gradeMap.put("F", 0.0);

        double totalScore = 0.0;
        double totalCredit = 0.0;

        for(int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());

            String subject = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if(!grade.equals("P")) {
                totalScore += credit*gradeMap.get(grade);
                totalCredit += credit;
            }
            
        }

        System.out.printf("%.6f\n", totalScore / totalCredit);
    }
}
