package teacher;

import lessons.ClassName;
import lessons.Lesson;

import java.util.ArrayList;

public class Teacher {

    private String fullName;
    private Lesson lesson;
    private ArrayList<ClassName> className;

    public Teacher(String fullName, Lesson lesson) {
        this.fullName = fullName;
        this.lesson = lesson;
        this.className = new ArrayList<>();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public ArrayList<ClassName> getClassName() {
        return new ArrayList<ClassName>();
    }

    public void setClassName(ArrayList<ClassName> className) {
        this.className = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "fullName='" + fullName + '\'' +
                ", lesson=" + lesson +
                ", className=" + className +
                '}';
    }
}
