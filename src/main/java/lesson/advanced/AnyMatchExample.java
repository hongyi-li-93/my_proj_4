package lesson.advanced;

import java.util.Arrays;
import java.util.List;

public class AnyMatchExample {
    public static void main(String[] args) {
        List<Integer> myNums = Arrays.asList(3,5,1,7,7,9);
        boolean hasEven = myNums.stream().anyMatch(nb -> {
            System.out.println(nb);
            return nb % 2 == 0;
        });
        System.out.println(hasEven);
    }

}
