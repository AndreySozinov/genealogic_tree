package gen_tree;

public class person {
    private String first_name, second_name;
    private int age;
    
    public person(String name, String surname, int age) {
        this.first_name = name;
        this.second_name = surname;
        this.age = age;
    }
    
    public String getName() {
        return first_name;
    }
    public String getSurname() {
        return second_name;
    }
    public int getAge() {
        return age;
    }
}
