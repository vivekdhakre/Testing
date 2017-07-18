package geeksforgeeks;

/**
 * @author Vivek on 11/7/17.
 * @project Test
 * @package geeksforgeeks
 */
public class StaticClassTest {
    public static void main(String[] args) {

//      Creating Instance of Static Nested Class
        OuterClass.NestedStaticClass nestedStaticClass = new OuterClass.NestedStaticClass();
        nestedStaticClass.printMessage();

//      if we want to create an instance of nested non-static class then first
//      we need to create an instance of outer after that using that class object,
//      we can created inner class object. See below Example
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();

        inner.display();

//      we can also combine above steps in one step to create instance of
//      Inner class
        OuterClass.InnerClass innerObject = new OuterClass().new InnerClass();

//      similarly we can now call Inner class method
        innerObject.display();


    }
}

/* Java program to demonstrate how to implement static and non-static
   classes in a java program. */
class OuterClass {
    private static String msg = "GeeksForGeeks";

    // Static nested class
    public static class NestedStaticClass {

        // Only static members of Outer class is directly accessible in nested
        // static class
        public void printMessage() {

            // Try making 'message' a non-static variable, there will be
            // compiler error
            System.out.println("Message from nested static class: " + msg);
        }
    }

    // non-static nested class - also called Inner class
    public class InnerClass {

        // Both static and non-static members of Outer class are accessible in
        // this Inner class
        public void display() {
            System.out.println("Message from non-static nested class: " + msg);
        }
    }
}
