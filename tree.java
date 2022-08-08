package gen_tree;

import java.util.ArrayList;
import java.util.List;

import gen_tree.Relationship.Link;

public class Tree {
    private List<Relationship> family_tree = new ArrayList<>();

    public List<Relationship> getLinks() {
        return family_tree;
    }

    public void addLink(Person p1, Person p2, Link link1to2, Link link2to1) {
        Relationship l1 = new Relationship(p1, p2, link1to2);
        Relationship l2 = new Relationship(p2, p1, link2to1);

        family_tree.add(l1);
        family_tree.add(l2);
    }

}
