package gen_tree;

import java.time.Year;

public class Person {
    private String firstName; 
    private String secondName;
    private Year birthYear;
    
    public Person(String name, String surname, int year) {
        this.firstName = name;
        this.secondName = surname;
        this.birthYear = Year.of(year);
    }
    
    public String getName() {
        return firstName;
    }
    public String getSurname() {
        return secondName;
    }
    public Year getBirthyear() {
        return birthYear;
    }

    @Override
    public String toString() {
        return "Person {name = '" + firstName + '\'' + 
                        ", surname = '" + secondName + '\'' + '}';
    }
}
