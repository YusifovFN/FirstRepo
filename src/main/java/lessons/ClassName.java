package lessons;

import java.util.ArrayList;

public class ClassName {

    private String name;
    private int studentCount;
    private ArrayList<Lesson> lesson;

    public ClassName(String name, int studentCount) {
        this.name = name;
        this.studentCount = studentCount;
        this.lesson = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public ArrayList<Lesson> getLesson() {
        return lesson;
    }

    public void setLesson(ArrayList<Lesson> lesson) {
        this.lesson = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "ClassName{" +
                "name='" + name + '\'' +
                ", studentCount=" + studentCount +
                ", lesson=" + lesson +
                '}';
    }
}
