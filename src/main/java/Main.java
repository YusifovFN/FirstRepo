import lessons.ClassName;
import lessons.Lesson;
import student.Student;
import teacher.Teacher;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int a = 5;
        long b = a;
        int c = (int) b;
        Integer m = (int) b;

        float f = 33;
        double ff = f;
        float aa = ff;

        int g = (int) f;



        Lesson mathLesson = new Lesson("Math");
        Teacher mathTeacher = new Teacher("Anar Shoyubov", mathLesson);
        ClassName bestClass = new ClassName("Best", 22);

        Student aliAliyev = new Student("Ali Aliyev");

        ArrayList<ClassName> classes = new ArrayList<>();
        classes.add(bestClass);
        ArrayList<Lesson> lessons = new ArrayList<>();
        lessons.add(mathLesson);

        aliAliyev.setClassName(bestClass);

        for (Lesson t : lessons) {
            System.out.println(t);
        }
    }
}
