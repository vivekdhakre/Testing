package geeksforgeeks;

/**
 * Created by ahoy on 2/6/17.
 */
public class InstanceVariableHiding {

    int value = 10;

    public static void main(String[] args) {
        InstanceVariableHiding ivh = new InstanceVariableHiding();
        ivh.method();
    }

    void method() {
        // This local variable hides instance variable
        int value = 40;

        System.out.println("Value of Instance variable :"
                + this.value);
        System.out.println("Value of Local variable :"
                + value);
    }


}
