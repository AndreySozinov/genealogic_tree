package gen_tree;

public class relationship {
    public enum Link {
        PARENT,
        CHILD
    }
    
    private person person1, person2;
    private Link link;

    public relationship(person personA, person personB, Link link) {
        this.person1 = personA;
        this.person2 = personB;
        this.link = link;
    }

    public person getPersonA() {
        return person1;
    }

    public person getPersonB() {
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
