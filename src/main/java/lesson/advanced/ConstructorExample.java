package lesson.advanced;

import lesson.advanced.constructors.Person1;
import java.util.UUID;

public class ConstructorExample {
    public static void main(String[] args){
        Person1 shane = new Person1("bffa74d2-0239-46fb-bfde-535d71c3027a", "shane", "Waos");
        System.out.println(shane);
    }

}
