package gen_tree;

import java.util.Comparator;

public class MyComparator implements Comparator<Relationship>{
    @Override
    public int compare(Relationship o1, Relationship o2) {
        if(o1.getPersonA().getBirthyear().isAfter(o2.getPersonA().getBirthyear())) return -1;
        if(o1.getPersonA().getBirthyear().isBefore(o2.getPersonA().getBirthyear())) return 1;
        return 0;
    }
}
