package lesson.advanced;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ForEachExample {
    public static void main(String[] args) {
        String[] letters = {"B", "D", "C", "A",};
        Stream<String> myLettersStream = Stream.of(letters);

        Consumer<String> myPrint = System.out::print;

        //myLettersStream.sorted();
        //myLettersStream.forEach(myPrint);
        myLettersStream.sorted().forEach(myPrint);
    }
}
