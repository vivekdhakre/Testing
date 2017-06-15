/**
 * Created by ahoy on 5/6/17.
 */
public class DeepCopyExample {

    public static void main(String[] args) throws CloneNotSupportedException {
        Course2 science = new Course2("Physics", "Chemistry", "Maths");

        Student2 student2_1 = new Student2(11, "Vivek", science);

        Student2 student2_2 = (Student2) student2_1.clone();

        System.out.println(student2_1.course2.subject3);

        student2_2.course2.subject3 = "Bio";

        System.out.println(student2_1.course2.subject3);
    }

}


class Course2 implements Cloneable {

    String subject1;
    String subject2;
    String subject3;

    public Course2(String subject1, String subject2, String subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Student2 implements Cloneable {

    int id;
    String name;
    Course2 course2;

    public Student2(int id, String name, Course2 course2) {
        this.id = id;
        this.name = name;
        this.course2 = course2;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student2 student2 = (Student2) super.clone();
        student2.course2 = (Course2) course2.clone();
        return student2;
    }
}
