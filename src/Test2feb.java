/**
 * Created by vivek on 2/2/17.
 */
public class Test2feb {
    public static void main(String[] args) {

//        for(int i=0 ; i<10 ; i++){
//            System.out.println(i);
//            if(true){
//                switch (i){
//                    case 0:
//                        System.out.println("Hello oth block");
//                        break;
//
//                    case 1:
//                        System.out.println("Hello 1st block");
//                        if(true)break;
//                        break;
//
//                }
//                break;
//            }
//        }

        Test2feb t = new Test2feb();
        t.method(null);

    }

    public void method(Object object){
        System.out.println("inside method object");
    }


    public void method(String s){
        System.out.println("inside method String");
    }

}
