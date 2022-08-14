package gen_tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import gen_tree.Relationship.Link;

public class Tree implements Iterable<Relationship>{
    private List<Relationship> familyTree = new ArrayList<>();

    public List<Relationship> getLinks() {
        return familyTree;
    }

    public void addLink(Person p1, Person p2, Link link1to2, Link link2to1) {
        Relationship l1 = new Relationship(p1, p2, link1to2);
        Relationship l2 = new Relationship(p2, p1, link2to1);

        familyTree.add(l1);
        familyTree.add(l2);
    }

    @Override
    public Iterator<Relationship> iterator() {
        Iterator<Relationship> iter = new Iterator<Relationship>() {
             private int index = 0;

             @Override
             public boolean hasNext() {
                 return index < familyTree.size();
             }

             @Override
             public Relationship next() {
                 return familyTree.get(index++);
             }
        };
        return iter;
    }

}
