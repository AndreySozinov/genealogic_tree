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

        relationship IvanPetr = new relationship(IvanPetrov, PetrPetrov, Link.PARENT, Link.CHILD);
        relationship ivanOlga = new relationship(IvanPetrov, OlgaPetrova, Link.PARENT, Link.CHILD);
        relationship PetrVasya = new relationship(PetrPetrov, VasyaPetrov, Link.PARENT, Link.CHILD);
        relationship PetrJenya = new relationship(PetrPetrov, JenyaPetrov, Link.PARENT, Link.CHILD);
        relationship OlgaSidor = new relationship(OlgaPetrova, SidorPetrov, Link.PARENT, Link.CHILD);
    }
}
