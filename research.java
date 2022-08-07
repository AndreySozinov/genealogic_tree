package gen_tree;

import java.util.List;

import gen_tree.relationship.Link;

public class research {
    public static void printAllChildren(String person, tree tree) {
        List<relationship> links = tree.getLinks();

        for (relationship el : links) {
            if (el.getPersonA().getName().equals(person) && el.getLink() == Link.PARENT) {
                System.out.println(el.getPersonB());
            }
        }
    }
}
