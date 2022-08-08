package gen_tree;

import java.util.List;

import gen_tree.Relationship.Link;

public class Research {
    public static void printAllChildren(Person person, Tree tree) {
        List<Relationship> links = tree.getLinks();

        for (Relationship el : links) {
            if (el.getPersonA().equals(person) && el.getLink() == Link.PARENT) {
                System.out.println(el.getPersonB());
            }
        }
    }

    public static void printAllBrothers(Person person, Tree tree) {
        List<Relationship> links = tree.getLinks();

        for (Relationship el : links) {
            if (el.getPersonB().equals(person) && el.getLink() == Link.BROTHER) {
                System.out.println(el.getPersonA());
            }
        }
    }

    public static void printAllSisters(Person person, Tree tree) {
        List<Relationship> links = tree.getLinks();

        for (Relationship el : links) {
            if (el.getPersonB().equals(person) && el.getLink() == Link.SISTER) {
                System.out.println(el.getPersonA());
            }
        }
    }
}
