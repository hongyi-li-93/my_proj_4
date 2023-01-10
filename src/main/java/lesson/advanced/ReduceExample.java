package lesson.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> myNums = Arrays.asList(4,5,6,7,8);
        Optional<Integer> result = myNums.stream().reduce((cum, nb) -> cum + nb);
        System.out.println(result);
    }
}
