// 저자 출제_02_배열 제어하기

package programmers;

import java.util.Arrays;
import java.util.Collections;

public class Array_Control {
    private static int[] solution(int[] arr) {
        Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[] :: new);
        Arrays.sort(result, Collections.reverseOrder());
        return Arrays.stream(result).mapToInt(Integer :: intValue).toArray();
    }

    public static void main(String[] args) {
        int[] n = {4, 2, 2 ,1, 3, 4};
        System.out.println(Arrays.toString(solution(n)));
    }
}
