import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Base64;

/**
 * Created by vivek on 21/12/16.
 */
public class WideningPrimitive extends Exception{

    public static void main(String[] args) {
//        System.out.print("Y" + "O");
//        System.out.print(15.5+"O");

//        int x = 012;
//        System.out.print(x);

//        final Test1 t1 = new Test1();
//        System.out.println(t1.i);
//        t1.i = 30;
//        System.out.println(t1.i);

//        Test2feb obj1 = new Test2feb();
//        obj1.method();

        // String class is loaded by bootstrap loader, and
        // bootstrap loader is not Java object, hence null
       // System.out.println(String.class.getClassLoader());

        // Test2feb class is loaded by Application loader
        //System.out.println(Test2feb.class.getClassLoader());

//        String fileName = "ureward.mp4";
//        String fileType =fileName.split("\\.")[1];
//        fileType = fileType.toLowerCase().matches("mp4|3gp")?("video/"+fileType):("image/"+fileType);
        try {
            String fileType = "video/mp4";

            String encode = URLEncoder.encode(fileType,"UTF-8");

            System.out.println(encode);

            String decode = URLDecoder.decode(encode,"UTF-8");
            System.out.println(decode);

        }catch(Exception e){
            System.out.println(e);
        }


    }
}

class Test1 {
    int i = 10;
}

class Test
{
    // Instance variable or member variable
    private int value = 10;

    void method()
    {
        // This local variable hides instance variable
        int value = 40;

        System.out.println("Value of Instance variable :"
                + this.value);
        System.out.println("Value of Local variable :"
                + value);
    }
}
