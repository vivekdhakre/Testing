import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.Buffer;

/**
 * Created by vivek on 22/12/16.
 */
public class PushCoupon {

    public static void main(String[] args) {


        try {

            BufferedReader br = new BufferedReader(new FileReader("/home/vivek/Downloads/Document3.txt"));
            String line = null;
            int i = 0;
            while((line=br.readLine())!=null){
                //line = "9971361819";
                String api = "http://uahoy.com/mobilecoupon/onering?ChannelID=8030636054&who="+line.trim();
                System.out.println((++i)+" | "+line+" | "+processURL(api));
//                break;
//                System.out.println(line);
            }


        } catch (Exception e){

        }

    }

    public static String processURL(String paramString) {
        StringBuffer buffer = new StringBuffer();
        try {
            URL url = new URL(paramString);
            URLConnection urlConnection = url.openConnection();
            urlConnection.setConnectTimeout(25000);
//      localURLConnection.setReadTimeout(25000);

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String str;
            while ((str = bufferedReader.readLine()) != null)
                buffer.append(str);
            bufferedReader.close();
        } catch (Exception localException) {
            System.out.println(paramString + " | " + localException);
        }
        return buffer.toString();
    }
}
