package lesson.advanced.builder;

import lombok.Getter;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;
import java.util.UUID;

@Getter
@ToString
public class Person2 {
    private UUID id;
    private String firstName;
    private String middleName;
    private String lastName;

    private Person2(UUID id, String firstName, String middleName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public static class Person2Builder {
        private UUID id;
        private String firstName;
        private String middleName;
        private String lastName;



        public Person2Builder(UUID id, String firstName, String lastName) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Person2Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Person2Builder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Person2Builder id(String id) {
            this.id = StringUtils.isEmpty(id) ? null : UUID.fromString(id);
            return this;
        }

        public Person2Builder id(UUID id) {
            this.id = id;
            return this;
        }

        private void validate() {
            if(StringUtils.isEmpty(firstName)) {
                throw new IllegalArgumentException("Required argument firstName missing!");
            }
            if(StringUtils.isEmpty(lastName)) {
                throw new IllegalArgumentException("Required argument lastName missing!");
            }
            if(id == null) {
                throw new IllegalArgumentException("Required argument id missing!");
            }
        }

        public Person2 build() {
            validate();
            return new Person2(id, firstName, middleName, lastName);
        }

    }
}
