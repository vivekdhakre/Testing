package cloneEx;

/**
 * Created by vivek on 2/4/17.
 */
public class Student18 implements Cloneable{

    int rollno;
    String name;

    Student18(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {

        if(obj == this)return true;

        if(!(obj instanceof Student18))return false;

        Student18 s = (Student18) obj;
        return s.name.equals(name) && s.rollno == rollno;

    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + rollno;
        return result;
    }

    public static void main(String args[]){
        try{
            Student18 s1=new Student18(101,"amit");

            Student18 s2=(Student18)s1.clone();

            System.out.println(s1.equals(s2));

            s2.setName("vivek");
            System.out.println(s1.rollno+" "+s1.name);
            System.out.println(s2.rollno+" "+s2.name);
            System.out.println(s1.equals(s2));

        }catch(CloneNotSupportedException c){
            System.out.println(c);
        }

    }
}
