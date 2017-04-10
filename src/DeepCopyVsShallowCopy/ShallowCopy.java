package DeepCopyVsShallowCopy;

/**
 * Created by vivek on 3/3/17.
 */
public class ShallowCopy {
    public static void main(String[] args) {
        Student student = new Student("John","Algebra");
        System.out.println("Original Object: "+student.getName()+" | "+student.getSubject().getName());

        Student studentClone = (Student) student.clone();
        System.out.println("Clone Object: "+studentClone.getName()+" | "+studentClone.getSubject().getName());

        student.setName("vivek");
        student.getSubject().setName("Java");
        System.out.println("Original Object after update: "+student.getName()+" | "+student.getSubject().getName());
        System.out.println("Clone Object after update: "+studentClone.getName()+" | "+studentClone.getSubject().getName());
    }
}

class Subject{

    private String name;

    public Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Student implements Cloneable{

    private Subject subject;

    private String name;

    public Student(String name, String sub) {
        this.name = name;
        subject = new Subject(sub);

    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object clone(){
        try{
            return super.clone();
        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}