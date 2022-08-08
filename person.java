package gen_tree;

public class Person {
    private String first_name, second_name;
    private int birthyear;
    
    public Person(String name, String surname, int birthyear) {
        this.first_name = name;
        this.second_name = surname;
        this.birthyear = birthyear;
    }
    
    public String getName() {
        return first_name;
    }
    public String getSurname() {
        return second_name;
    }
    public int getBirthyear() {
        return birthyear;
    }

    @Override
    public String toString() {
        return "Person {name = '" + first_name + '\'' + 
                        ", surname = '" + second_name + '\'' + '}';
    }
}
