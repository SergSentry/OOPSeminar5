package View;

import Data.Student;
import Data.StudyGroup;

public class StudentView {
    public void printOnConsole(Student student){
        System.out.println(student.toString());
    }

    public void printOnConsole(StudyGroup studyGroup){
        System.out.println(studyGroup.toString());
    }
}
