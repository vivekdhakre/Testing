/**
 * Created by ahoy on 5/6/17.
 */
public class ShallowCopyExample {

    public static void main(String[] args) throws CloneNotSupportedException {

        Course science = new Course("Physics", "Chemistry", "Maths");

        Student1 student = new Student1(11, "Vivek", science);

        Student1 student1 = (Student1) student.clone();

        System.out.println(student.course.subject3);

        student1.course.subject3 = "Bio";

        System.out.println(student.course.subject3);


    }
}

class Course {

    String subject1;

    String subject2;

    String subject3;

    public Course(String subject1, String subject2, String subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }
}

class Student1 implements Cloneable {

    int id;

    String name;

    Course course;

    public Student1(int id, String name, Course course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
