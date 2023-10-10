package Data;

import java.util.List;

public class StudyGroup implements Iterable<Student>{
    private List<Student> students;
    private Teacher teacher;

    public StudyGroup(Teacher teacher, List<Student> students) {
        this.students = students;
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "students=" + students +
                ", teacher=" + teacher +
                '}';
    }

    @Override
    public StudyGroupIterator iterator() {
        return new StudyGroupIterator(this);
    }
}