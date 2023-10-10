package Data;

import java.util.Iterator;
import java.util.List;

public class StudyGroupIterator implements Iterator<Student> {

    private int counter;
    private final List<Student> students;

    public StudyGroupIterator(StudyGroup studyGroup) {
        this.students = studyGroup.getStudents();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < students.size() - 1;
    }

    @Override
    public Student next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        return students.get(counter);
    }
}
