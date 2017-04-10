package DeepCopyVsShallowCopy;

/**
 * Created by vivek on 3/3/17.
 */
public class DeepCopy {

    public static void main(String[] args) {

        Student1 student = new Student1("John","Algebra");
        System.out.println("Original Object: "+student.getName()+" | "+student.getSubject().getName());

        Student1 studentClone = (Student1) student.clone();
        System.out.println("Clone Object: "+studentClone.getName()+" | "+studentClone.getSubject().getName());

        student.setName("vivek");
        student.getSubject().setName("Java");
        System.out.println("Original Object after update: "+student.getName()+" | "+student.getSubject().getName());
        System.out.println("Clone Object after update: "+studentClone.getName()+" | "+studentClone.getSubject().getName());

    }
}



class Student1 implements Cloneable{

    private Subject subject;

    private String name;

    public Student1(String name, String sub) {
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
