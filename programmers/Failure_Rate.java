// 프로그래머스_06_실패율

package programmers;

import java.util.*;

public class Failure_Rate {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[] {2, 1, 2, 6, 2, 4, 3, 3})));
    }

    public static int[] solution(int N, int[] stages) {
        int[] challenger = new int[N + 2]; 

        for (int s : stages) {
            challenger[s]++;
        }

        double total = stages.length;
        Map<Integer, Double> fail = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            if (total == 0) {
                fail.put(i, 0.0);
            } else {
                fail.put(i, (double) challenger[i] / total);
                total -= challenger[i];
            }
        }

        return fail.entrySet().stream()
                .sorted((o1, o2) -> {
                    int cmp = Double.compare(o2.getValue(), o1.getValue());
                    return cmp != 0 ? cmp : Integer.compare(o1.getKey(), o2.getKey());
                })
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
