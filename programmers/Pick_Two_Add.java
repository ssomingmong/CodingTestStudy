// 프로그래머스_03_두 개 뽑아서 더하기

package programmers;

import java.util.HashSet;
import java.util.Arrays;

public class Pick_Two_Add {
    private static int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        return set.stream().sorted().mapToInt(Integer :: intValue).toArray();
    }

    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};
        System.out.println(Arrays.toString(solution(numbers)));
    }
}
