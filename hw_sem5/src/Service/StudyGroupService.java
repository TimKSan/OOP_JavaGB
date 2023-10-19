package Service;

import java.util.ArrayList;
import java.util.List;

import Data.Student;
import Data.StudyGroup;
import Data.Teacher;

public class StudyGroupService {

    private List<StudyGroup> studyGroupList;

    public StudyGroupService() {
        this.studyGroupList = new ArrayList<>();
    }

    public static StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {

        return new StudyGroup(teacher, students);
    }
}
