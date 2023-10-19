import java.util.ArrayList;
import java.util.List;

import Data.Student;
import Data.StudyGroup;
import Data.Teacher;
import Service.StudyGroupService;

public class Main {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("100", "100", "100", "100", 1);
        List<Student> students = new ArrayList<>();
        students.add(new Student("1","1","1","1", 1));
        students.add(new Student("1","1","1","1", 1));
        students.add(new Student("1","1","1","1", 1));
        students.add(new Student("1","1","1","1", 1));

        StudyGroup classGroup = StudyGroupService.createStudyGroup(teacher, students);
        System.out.println(classGroup);
    }
}