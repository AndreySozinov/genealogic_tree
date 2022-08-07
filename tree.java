package gen_tree;

import java.util.ArrayList;
import java.util.List;

import gen_tree.relationship.Link;

public class tree {
    private List<relationship> family_tree = new ArrayList<>();

    public List<relationship> getLinks() {
        return family_tree;
    }

    public void addLink(person p1, person p2, Link link1to2, Link link2to1) {
        relationship l1 = new relationship(p1, p2, link1to2);
        relationship l2 = new relationship(p2, p1, link2to1);

        family_tree.add(l1);
        family_tree.add(l2);
    }

}
