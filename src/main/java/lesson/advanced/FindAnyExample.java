package lesson.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyExample {
    public static void main(String[] args) {
        List<Integer> myNums = Arrays.asList(15,3,5,1,7,21,9,11,9,17,23,27,29,21,15,3,5,1,7,21,9,11,12,23,24,26, 15,3,5,1,7,21,9,11,12,23,24,26,2,15,3,5,1,7,21,9,11,12,23,24,26);
        Optional<Integer> findNumber = myNums.stream().filter(nb -> nb % 2 == 0).findAny();
        System.out.println(findNumber);
    }
}
