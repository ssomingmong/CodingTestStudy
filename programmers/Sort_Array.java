// 저자 출제 / 01.배열 정렬하기

package programmers;
import java.util.Arrays;

public class Sort_Array {
    public static void main(String[]args) {
        int[] org = {4, 2, 3, 1, 5};
        int[] sorted = solution(org);
        System.out.println(Arrays.toString(org));
        System.out.println(Arrays.toString(sorted));
    }    

    private static int[] solution(int[] arr) {
        int[] clone = arr.clone();
        Arrays.sort(clone);
        return clone;
    }
}
