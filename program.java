package gen_tree;

import gen_tree.relationship.Link;

public class program {
    public static void main(String[] args) {
        person IvanPetrov = new person("Ivan", "Petrov", 58);
        person PetrPetrov = new person("Petr", "Petrov", 28);
        person OlgaPetrova = new person("Olga", "Petrova", 20);
        person VasyaPetrov = new person("Vasya", "Petrov", 8);
        person JenyaPetrov = new person("Jenya", "Petrov", 6);
        person SidorPetrov = new person("Sidor", "Petrov", 2);

        tree my_tree = new tree();
        my_tree.addLink(IvanPetrov, PetrPetrov, Link.PARENT, Link.CHILD);
        my_tree.addLink(IvanPetrov, OlgaPetrova, Link.PARENT, Link.CHILD);
        my_tree.addLink(PetrPetrov, VasyaPetrov, Link.PARENT, Link.CHILD);
        my_tree.addLink(PetrPetrov, JenyaPetrov, Link.PARENT, Link.CHILD);
        my_tree.addLink(OlgaPetrova, SidorPetrov, Link.PARENT, Link.CHILD);

        
    }
}
