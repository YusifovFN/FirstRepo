package lessons;

import teacher.Teacher;

public class Lesson {

    private String name;
    private Teacher teacher;

    public Lesson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setTeachers(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
