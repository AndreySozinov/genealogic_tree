package gen_tree;

import java.util.List;

import gen_tree.Relationship.Link;

public class Program {
    public static void main(String[] args) {
        Person tonyaPetrova = new Person("Tonya", "Petrova", 1958);
        Person ivanPetrov = new Person("Ivan", "Petrov", 1952);
        Person petrPetrov = new Person("Petr", "Petrov", 1978);
        Person lyubaPetrova = new Person("Lyuba", "Petrova", 1976);
        Person olgaPetrova = new Person("Olga", "Petrova", 1980);
        Person vasyaPetrov = new Person("Vasya", "Petrov", 1998);
        Person jenyaPetrov = new Person("Jenya", "Petrov", 1996);
        Person sidorPetrov = new Person("Sidor", "Petrov", 2002);
        
        Tree myTree = new Tree();
        myTree.addLink(ivanPetrov, petrPetrov, Link.PARENT, Link.CHILD);
        myTree.addLink(ivanPetrov, olgaPetrova, Link.PARENT, Link.CHILD);
        myTree.addLink(petrPetrov, vasyaPetrov, Link.PARENT, Link.CHILD);
        myTree.addLink(petrPetrov, jenyaPetrov, Link.PARENT, Link.CHILD);
        myTree.addLink(olgaPetrova, sidorPetrov, Link.PARENT, Link.CHILD);
        myTree.addLink(tonyaPetrova, ivanPetrov, Link.WIFE, Link.HUSBAND);
        myTree.addLink(lyubaPetrova, petrPetrov, Link.WIFE, Link.HUSBAND);
        myTree.addLink(petrPetrov, olgaPetrova, Link.BROTHER, Link.SISTER);
        myTree.addLink(vasyaPetrov, jenyaPetrov, Link.BROTHER, Link.BROTHER);
        myTree.addLink(vasyaPetrov, sidorPetrov, Link.BROTHER, Link.BROTHER);
        myTree.addLink(jenyaPetrov, sidorPetrov, Link.BROTHER, Link.BROTHER);
        myTree.addLink(petrPetrov, sidorPetrov, Link.UNCLE, Link.NEPHEW);
        myTree.addLink(lyubaPetrova, sidorPetrov, Link.AUNT, Link.NEPHEW);
        myTree.addLink(olgaPetrova, vasyaPetrov, Link.AUNT, Link.NEPHEW);
        myTree.addLink(olgaPetrova, jenyaPetrov, Link.AUNT, Link.NEPHEW);

        //Research.printAllBrothers(vasyaPetrov, myTree);
        
        //Output.outputData(myTree, Aim.CONSOLE);
        
        // Сортировка по годам рождения от младших к старшим
        List<Relationship> links = myTree.getLinks();
        links.sort(new MyComparator());
        
        // Iterator<Relationship> iter = links.iterator();
        // while (iter.hasNext()) {
        //     System.out.format("%s %s %s\n", iter.next().getPersonA(), 
        //                             iter.next().getLink(), 
        //                             iter.next().getPersonA().getBirthyear());
        // }

        for (var link : myTree) {
            System.out.format("%s %s %s\n", link.getPersonA(), 
                                     link.getLink(), 
                                     link.getPersonA().getBirthyear());
        }
    }
}
