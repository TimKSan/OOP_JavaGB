package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Potok implements Iterable<StudentGroup> {

    private List<StudentGroup> studentGroups;
    static int potokId = 1;

    public Potok() {
        this.studentGroups = new ArrayList<>();
    }

    public void addStudentGroup(StudentGroup studentGroup) {
        studentGroups.add(studentGroup);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return studentGroups.iterator();
    }

    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    public void setStudentGroups(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }

    @Override
    public String toString() {
        return "Potok " + potokId++ + "[studentGroups=" + studentGroups + "]";
    }   
}
