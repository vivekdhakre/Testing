package java7;

/**
 * Created by ahoy on 29/5/17.
 */
public class StringSwitch {
    public static void main(String[] args) {

//      String Switch
        String day = "NEW";
        switch (day) {
            case "NEW":
                System.out.println("Order is in NEW state");
                break;
            case "CANCELED":
                System.out.println("Order is Cancelled");
                break;
            case "REPLACE":
                System.out.println("Order is replaced successfully");
                break;
            case "FILLED":
                System.out.println("Order is filled");
                break;
            default:
                System.out.println("Invalid");
        }


    }
}
