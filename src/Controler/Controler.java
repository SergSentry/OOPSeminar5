package Controler;

import Data.Teacher;
import Data.Type;
import Data.User;
import Data.Student;
import Service.DataService;
import Service.StudyGroupService;
import View.StudentView;

import java.util.List;

public class Controler {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();
    private final StudyGroupService studyGroupService = new StudyGroupService();

    public void createStudent(String firstName, String secondName,
                              String lastName, String dateB){
        service.create(firstName,secondName,lastName,dateB, Type.STUDENT);
    }

    public void createStudyGroup(Teacher teacher, List<Student> students){
        studyGroupService.createStudyGroup(teacher, students);
        studentView.printOnConsole(studyGroupService.getStudyGroup());
    }

    public void getAllStudent(){
        List<User> userList = service.getAllStudent();
        for (User user: userList){
            studentView.printOnConsole((Student) user);
        }
    }
}
