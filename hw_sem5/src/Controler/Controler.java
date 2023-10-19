package Controler;

import Data.Type;
import Data.User;
import Data.Student;
import Data.Teacher;
import Service.DataService;
import Service.StudyGroupService;
import View.StudentView;

import java.util.List;

public class Controler {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();
    private final StudyGroupService studyGroup = new StudyGroupService();

    public void createStudent(String firstName, String secondName, String lastName, String dateB) {
        service.create(firstName, secondName, lastName, dateB, Type.STUDENT);
    }

    public void createStudyGroup(Teacher teacher, List<Student> students) {
        StudyGroupService.createStudyGroup(teacher, students);
    }

    public void getAllStudent() {
        List<User> userList = service.getAllStudent();
        for (User user : userList) {
            studentView.printOnConsole((Student) user);
        }
    }
}
