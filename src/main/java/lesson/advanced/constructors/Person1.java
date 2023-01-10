package lesson.advanced.constructors;

import java.util.UUID;
import lombok.Getter;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;

@Getter
@ToString
public class Person1 {
    private UUID id;
    private String firstName;
    private String middleName;
    private String lastName;

    public Person1(
            UUID id,
            String firstName,
            String lastName
    ){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        validate();
    }

    public Person1(
            UUID id,
            String firstName,
            String lastName,
            String middleName
    ){
        this(id, firstName, lastName);
        this.middleName = middleName;
    }

    public Person1(
            String sid,
            String firstName,
            String lastName
    ){
        this(StringUtils.isEmpty(sid) ? UUID.randomUUID() : UUID.fromString(sid), firstName, lastName);
    }

    private void validate(){
        if(
                StringUtils.isEmpty(firstName)
                        || StringUtils.isEmpty(lastName)
                        || id == null
        ){
            throw new IllegalArgumentException("Required argument missing!");
        }
    }

}
