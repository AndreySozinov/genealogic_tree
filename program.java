package gen_tree;

import gen_tree.Relationship.Link;

public class Program {
    public static void main(String[] args) {
        Person TonyaPetrova = new Person("Tonya", "Petrova", 1955);
        Person IvanPetrov = new Person("Ivan", "Petrov", 1952);
        Person PetrPetrov = new Person("Petr", "Petrov", 1978);
        Person LyubaPetrova = new Person("Lyuba", "Petrova", 1976);
        Person OlgaPetrova = new Person("Olga", "Petrova", 1980);
        Person VasyaPetrov = new Person("Vasya", "Petrov", 1998);
        Person JenyaPetrov = new Person("Jenya", "Petrov", 1996);
        Person SidorPetrov = new Person("Sidor", "Petrov", 2002);
        
        Tree my_tree = new Tree();
        my_tree.addLink(IvanPetrov, PetrPetrov, Link.PARENT, Link.CHILD);
        my_tree.addLink(IvanPetrov, OlgaPetrova, Link.PARENT, Link.CHILD);
        my_tree.addLink(PetrPetrov, VasyaPetrov, Link.PARENT, Link.CHILD);
        my_tree.addLink(PetrPetrov, JenyaPetrov, Link.PARENT, Link.CHILD);
        my_tree.addLink(OlgaPetrova, SidorPetrov, Link.PARENT, Link.CHILD);
        my_tree.addLink(TonyaPetrova, IvanPetrov, Link.WIFE, Link.HUSBAND);
        my_tree.addLink(LyubaPetrova, PetrPetrov, Link.WIFE, Link.HUSBAND);
        my_tree.addLink(PetrPetrov, OlgaPetrova, Link.BROTHER, Link.SISTER);
        my_tree.addLink(VasyaPetrov, JenyaPetrov, Link.BROTHER, Link.BROTHER);
        my_tree.addLink(VasyaPetrov, SidorPetrov, Link.BROTHER, Link.BROTHER);
        my_tree.addLink(JenyaPetrov, SidorPetrov, Link.BROTHER, Link.BROTHER);
        my_tree.addLink(PetrPetrov, SidorPetrov, Link.UNCLE, Link.NEPHEW);
        my_tree.addLink(LyubaPetrova, SidorPetrov, Link.AUNT, Link.NEPHEW);
        my_tree.addLink(OlgaPetrova, VasyaPetrov, Link.AUNT, Link.NEPHEW);
        my_tree.addLink(OlgaPetrova, JenyaPetrov, Link.AUNT, Link.NEPHEW);

        //Research.printAllBrothers(VasyaPetrov, my_tree);
        Output.output_data(my_tree, Aim.CONSOLE);
    }
}
