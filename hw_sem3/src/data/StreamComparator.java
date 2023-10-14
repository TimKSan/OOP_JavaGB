package data;

import java.util.Comparator;

public class StreamComparator implements Comparator<Potok> {

    @Override
    public int compare(Potok p1, Potok p2) {
        int count1 = p1.getStudentGroups().size();
        int count2 = p2.getStudentGroups().size();

        if (count1 > count2) {
            return 1;
        } else if (count1 < count2) {
            return -1;
        } return 0;
    
    }
}
