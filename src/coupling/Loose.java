package coupling;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by rtbkit on 30/3/17.
 */
public class Loose {

    public static void main(String[] args) throws Exception{

//        Travel t = new Travel();
//        t.setV(new Bike());
//        t.startJourney();

        int i = 10;
        SimpleDateFormat format1 = new SimpleDateFormat("MMM-yy");
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


        Calendar cal = Calendar.getInstance();

//        int month = cal.get(Calendar.MONTH);

//        System.out.println(year);
//        do{
//            //System.out.println(month);
//            Calendar cal = Calendar.getInstance();
//            int year = cal.get(Calendar.YEAR);
//            int month = ((cal.get(Calendar.MONTH))+1-i);
//            if(month-i<=0)year--;
//            if(month-i <=0)month= 12+month;
////            month = (month)+1-i;
//
//            cal.set(year,month-1,1);
////            System.out.println(month+" | "+year+" | "+cal.getActualMaximum(Calendar.DAY_OF_MONTH));
//            Date fDate = format2.parse(year+"-"+(month-i)+"-01 00:00:00");
//            Date tDate = format2.parse(year+"-"+(month-i)+"-"+cal.getActualMaximum(Calendar.DAY_OF_MONTH)+" 23:59:59");
//            System.out.println(fDate+" | "+tDate+" | "+format1.format(fDate));
//
//
//            i--;
//        }while(i>0);

        int year = cal.get(Calendar.YEAR);
        do{
            i--;
            cal = Calendar.getInstance();
            int month = ((cal.get(Calendar.MONTH))+1-i);
            int yr = month<=0?year-1:year;
            month = month <=0 ? 12+month : month;
            System.out.println(i+" | "+month+" | "+yr);

            cal.set(year,month-1,1);
            Date fDate = format2.parse(yr+"-"+month+"-01 00:00:00");
            Date tDate = format2.parse(yr+"-"+month+"-"+cal.getActualMaximum(Calendar.DAY_OF_MONTH)+" 23:59:59");

            System.out.println(fDate+" | "+tDate);
        }while(i>0);

//        Calendar now= Calendar.getInstance();
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(Calendar.YEAR, 2012);
//        calendar.set(Calendar.MONTH, 1);
//        calendar.set(Calendar.DATE,3);
//
//        System.out.println(calendar.getTime());
//        System.out.println("Current Year is : " + now.get(Calendar.YEAR));
        // month start from 0 to 11
//        System.out.println("Current Month is : " + (now.get(Calendar.MONTH) + 1));
//        System.out.println("Current Date is : " + now.get(Calendar.DATE));

//        Car car = null;
//        Car.show();
    }
}

interface Vehicle {

    void start();

}
class Car implements Vehicle{

    @Override
    public void start() {
        System.out.println("Travel by car");

    }

    public static void show(){
        System.out.println("show method called");
    }

}

class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Travel by Bike");
    }

}

class Travel {

    Vehicle v;
    public void setV(Vehicle v){
        this.v=v;
    }

    public void startJourney(){
        v.start();
    }
}