package controller;

import data.Teacher;
import service.TeacherService;
import view.TeacherView;
import java.time.LocalDate;


public class TeacherController implements UserController<Teacher>{

    private final TeacherService dataService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        teacherView.sendOnConsole(dataService.getAll());
    }
}
