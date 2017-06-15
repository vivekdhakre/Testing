package fibonacci;

/**
 * @author Vivek on 15/6/17.
 * @project Test
 * @package fibonacci
 */
public class WithRecursion {
    static int n1 = 0;
    static int n2 = 1;
    static int n3 = 0;

    public static void printfibo(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
            printfibo(count - 1);
        }

    }

    public static void main(String[] args) {
        int count = 10;
        System.out.println(n1);
        System.out.println(n2);
        printfibo(count - 2);
    }
}
