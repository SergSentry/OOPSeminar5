package Service;

import Data.Student;
import Data.StudyGroup;
import Data.Teacher;
import Data.UserComparator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroupService {
    private StudyGroup studyGroup;

    public void createStudyGroup(Teacher teacher, List<Student> students) {
        this.studyGroup = new StudyGroup(teacher, students);
    }

    public StudyGroup getStudyGroup() {
        return studyGroup;
    }

    public Student getStudentFromStudyGroup(String firstName, String secondName){
        Iterator<Student> iterator = studyGroup.iterator();
        List<Student> result = new ArrayList<>();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if(student.getFirstName().equalsIgnoreCase(firstName)
               && student.getSecondName().equalsIgnoreCase(secondName)){
                result.add(student);
            }
        }
        if(result.size() == 0){
            throw new IllegalStateException(
                    String.format("Студент с именем %s и фамилией %s не найден", firstName, secondName)
            );
        }
        if(result.size() != 1){
            throw new IllegalStateException("Найдено более одного студента с указанными именем и фамилией");
        }
        return result.get(0);
    }

    public List<Student> getSortedByFIOStudyGroup(){
        List<Student> students = new ArrayList<>(studyGroup.getStudents());
        students.sort(new UserComparator<Student>());
        return students;
    }
}
