package lesson.advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstExample {
    public static void main(String[] args) {
        List<Integer> myNums = Arrays.asList(3,5,1,7,8,9);
        Optional<Integer> findN = myNums.stream().filter(nb -> nb % 2 == 0).findFirst();
        System.out.println(findN);
    }
}
