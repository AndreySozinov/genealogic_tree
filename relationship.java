package gen_tree;

public class relationship {
    enum Link {
        PARENT,
        CHILD
    }
    
    person person1, person2;
    Link link1to2;
    Link link2to1;

    public relationship(person personA, person personB, Link linkAtoB, Link linkBtoA) {
        this.person1 = personA;
        this.person2 = personB;
        this.link1to2 = linkAtoB;
        this.link2to1 = linkBtoA;
    }
}
