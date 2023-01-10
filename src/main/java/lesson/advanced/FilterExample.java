package lesson.advanced;

import java.util.Arrays;
import java.util.List;

public class FilterExample {
    public static void main(String[] args) {
        List<Integer> myNums = Arrays.asList(4,5,6,7,8,9);

        myNums.stream().filter(nb -> nb % 2 == 0).forEach(System.out::println);
    }
}
