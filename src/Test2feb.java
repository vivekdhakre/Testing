/**
 * Created by vivek on 2/2/17.
 */
public class Test2feb {
    public static void main(String[] args) throws Exception{

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

//        DateFormat format = new SimpleDateFormat("dd MMM, yyyy HH:mm:ss");
//        try {
//            Date startDate = format.parse("02 may, 2017 18:00:00");
////            Date endDate = format.parse("2017-05-02 18:00:00");
//            System.out.println(startDate);
////            System.out.println(endDate);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        System.out.println(String.class.getClassLoader());
        System.out.println(Test2feb.class.getClassLoader().getParent().getClass().getName());


//        Test2feb t = new Test2feb();
//        t.method(null);


//        Test2feb t = new Test2feb();
//        t.method(null);

        String password = "ahoy123";

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte byteData[] = md.digest(password.getBytes(StandardCharsets.UTF_8));
//        md.update(password.getBytes());

//        byte byteData[] = md.digest();
//        System.out.println(byteData.toString());


        //convert the byte to hex format method 1
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }

        System.out.println("Hex format : " + sb.toString());

//
//        //convert the byte to hex format method 2
//        StringBuffer hexString = new StringBuffer();
//        for (int i=0;i<byteData.length;i++) {
//            String hex=Integer.toHexString(0xff & byteData[i]);
//            if(hex.length()==1) hexString.append('0');
//            hexString.append(hex);
//        }
//        System.out.println("Hex format : " + hexString.toString());

    }



    public void method(Object object){
        System.out.println("inside method object");
    }


    public void method(String s){
        System.out.println("inside method String");
    }

}
