package lesson.advanced;

import lesson.advanced.builder.Person2;
import java.util.UUID;

public class BuilderExample {
    public static void main(String[] args) {
        Person2 shane = new Person2
                .Person2Builder(UUID.randomUUID(), "shane", "Crouch")
                .middleName(null)
                .build();
        System.out.println(shane);

        String idFromService = "fc3a90ec-387f-4e5b-8ab7-e41780f4fc63";
        Person2 nick = new Person2
                .Person2Builder("nick", "Crouch")
                .id(idFromService)
                .middleName("mid")
                .build();
        System.out.println(nick);

        Person2 chai = new Person2
                .Person2Builder("chai", "Crouch")
                .id(UUID.randomUUID())
                .middleName("mid")
                .build();
        System.out.println(chai);

    }
}
