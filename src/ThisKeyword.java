/**
 * Created by Vivek on 23/3/17.
 */

// 'this' is a reference variable that refers to a current object
public class ThisKeyword {

    int a;
    int b;

    //Default constructor
    ThisKeyword()
    {
        this(10, 20);
        System.out.println("Inside  default constructor \n");
    }

    // Parameterized constructor
    ThisKeyword(int a, int b)
    {
//        System.out.println("this.a: "+this.a+" | this.b: "+this.b);
//        System.out.println("a: "+a+" | b: "+ b);
        this.a = a;
        this.b = b;
        System.out.println("Inside parameterized constructor");
    }

    void display()
    {
        //Displaying value of variables a and b
        System.out.println("a = " + a + "  b = " + b);
    }

    public static void main(String[] args)
    {
        ThisKeyword object = new ThisKeyword();
//        object.display();
    }
}
