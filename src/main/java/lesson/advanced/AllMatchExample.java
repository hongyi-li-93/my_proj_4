package lesson.advanced;

import java.util.Arrays;
import java.util.List;

public class AllMatchExample {
    public static void main(String[] args) {
        List<Integer> myNums = Arrays.asList(4,5,6,7,8,9);
        boolean isAllEven = myNums.stream().allMatch(nb -> nb % 2 == 0);
        System.out.println(isAllEven);
    }
}
