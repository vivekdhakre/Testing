/**
 * Created by vivek on 6/2/17.
 */
public class Parent {

    public Parent display() {
        System.out.println("inside parent");
        return null;
    }

}
    class Child extends Parent{

        public Child display1(){
            System.out.println("inside child");
            return null;
        }


    public static void main(String[] args) {
        Parent parent = new Child();
        parent.display();
    }
}
