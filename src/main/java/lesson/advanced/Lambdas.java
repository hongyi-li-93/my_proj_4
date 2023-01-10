package lesson.advanced;

import java.util.function.Consumer;

public class Lambdas {
    public static void main(String[] args) {
        StudentRegistry studentregistry = new StudentRegistry();
        studentregistry.registerStudent("shane");
        studentregistry.registerStudent("christina");
        studentregistry.registerStudent("nick");
        studentregistry.registerStudent("chaiyi");
        //studentregistry.printAll();

        Consumer<String> consolPrinter = System.out::println;
        studentregistry.printAll(consolPrinter);
    }
}







