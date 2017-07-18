import javafx.util.Pair;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

/**
 * @author Vivek on 6/7/17.
 * @project Test18July
 * @package PACKAGE_NAME
 */
public class SendMail {

    public static void main(String[] args) {

        Timestamp timestamp = new Timestamp(1486665000000l);
        Date date = new Date(timestamp.getTime());

        // S is the millisecond
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

        System.out.println(simpleDateFormat.format(timestamp));
        System.out.println(simpleDateFormat.format(date));

//        Calendar cal = Calendar.getInstance();
//        cal.setTime(new Date());
//        cal.set(Calendar.HOUR_OF_DAY, 0);
//        cal.set(Calendar.MINUTE, 0);
//        cal.set(Calendar.SECOND, 0);
//        cal.set(Calendar.MILLISECOND, 0);
//
//        System.out.println(cal.getTime());
//        cal.add(Calendar.HOUR,1);
//        System.out.println(cal.getTime());

//        sendMail();
//        C11 c = new C11();
//        c.add(4,5);

        Pair<Integer, String> pair = new Pair<>(123, "vivek");

    }

    public static void sendMail() {
        try {


            final String user = "contact@shopezzy.com";
            final String password = "ohuMcfk8";

            Properties properties = System.getProperties();
            properties.setProperty("mail.smtp.host", "smtp.shopezzy.com");
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.port", "587");

            Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(user.trim(), password.trim());
                }
            });

            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user.trim()));

            message.addRecipient(Message.RecipientType.TO, new InternetAddress("vivek.dhakre6@gmail.com"));

            message.setSubject("Test18July");

            BodyPart bodyPart = new MimeBodyPart();
            bodyPart.setText("Hello");

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(bodyPart);

            message.setContent(multipart);
            Transport.send(message);


        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public static Timestamp getDateHours(Timestamp timestamp) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(timestamp);
//        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return new Timestamp(cal.getTimeInMillis());


    }
}


class P1 {

    public void add(int i, int j) {
        System.out.println("inside p1 -> " + i + " - " + j);
    }
}

class C11 extends P1 {
    public void add(long i, long j) {
        System.out.println("inside c1-> " + i + " - " + j);
    }
}
