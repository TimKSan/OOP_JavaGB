package service;

import java.util.Arrays;
import java.util.Collections;
import data.Potok;
import data.StreamComparator;
import data.StudentGroup;

class PotokServis {
    public static void main(String[] args) {
        Potok potok1 = new Potok();
        potok1.addStudentGroup(new StudentGroup("Группа 1"));
        potok1.addStudentGroup(new StudentGroup("Группа 2"));

        Potok potok2 = new Potok();
        potok2.addStudentGroup(new StudentGroup("Группа 3"));
        potok2.addStudentGroup(new StudentGroup("Группа 4"));
        potok2.addStudentGroup(new StudentGroup("Группа 5"));

        StreamComparator streamComparator = new StreamComparator();
        Collections.sort(Arrays.asList(potok1, potok2), streamComparator);

        System.out.println("Отсортированный список потоков:");
        System.out.println(potok1);
        System.out.println(potok2);
    }
}
