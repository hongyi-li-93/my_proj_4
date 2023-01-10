package lesson.advanced;

import java.util.Arrays;
import java.util.List;

public class NoneMatchExample {
    public static void main(String[] args) {
        List<Integer> myNums = Arrays.asList(1,5,6,7,8,9);
        boolean noEven = myNums.stream()
                .noneMatch(nb -> nb % 2 == 0);
        System.out.println(noEven);
    }
}
