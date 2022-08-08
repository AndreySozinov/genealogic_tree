package gen_tree;

public class Relationship {
    public enum Link {
        PARENT,
        CHILD,
        BROTHER,
        SISTER,
        UNCLE,
        AUNT,
        WIFE,
        HUSBAND,
        NEPHEW,
        NIECE
    }
    
    private Person person1, person2;
    private Link link;

    public Relationship(Person personA, Person personB, Link link) {
        this.person1 = personA;
        this.person2 = personB;
        this.link = link;
    }

    public Person getPersonA() {
        return person1;
    }

    public Person getPersonB() {
        return person2;
    }

    public Link getLink() {
        return link;
    }

    @Override
    public String toString() {
        return "Link {personA = " + person1 + ", personB = " + person2 +
                ", link = " + link + '}';
    }
}
