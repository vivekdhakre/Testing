import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.GZIPInputStream;

/**
 * Created by vivek on 30/1/17.
 */
public class Jabongtest {
    public static void main(String[] args) {
        long dealCount = 0;
        try {
            FileInputStream fin = new FileInputStream("/home/applogs/marketeer/files/jabong/affiliate_partner_feeds.xml.gz");
            GZIPInputStream gzis = new GZIPInputStream(fin);
            InputStreamReader isr = new InputStreamReader(gzis);
            BufferedReader br = new BufferedReader(isr);

            String line = null;
            int lineNo = 0;
            long itemCount = 0;
            String firstLine = "";
            StringBuilder builder = new StringBuilder();

            SimpleDateFormat format1 = new SimpleDateFormat("HH");

            while ((line = br.readLine()) != null) {

                {

                    if(lineNo<3){
                        lineNo++;
                        firstLine = firstLine+line+"\n";
                        builder.append(line.trim()+"\n");
                    }else{

                        if(line.trim().contains("</item>")){
                            dealCount++;
                            itemCount++;
                            if(itemCount==2){
                                String endline = line.trim().substring(0,line.indexOf("</item>")+6).trim()+"</root>";
                                builder.append(endline.trim());
                                System.out.println(builder);
//                                dealCount = this.processData(parseData(builder.toString()),serverUrl,dealCount);
                                itemCount=0;
                                builder = null;
                                builder = new StringBuilder();
                                builder.append(firstLine);
                                if(line.contains("<item>")){
                                    builder.append(line.trim().substring(line.trim().indexOf("<item>"))+"\n");
                                }
                               Thread.sleep(1000);
                            }else{
                                builder.append(line.trim()+"\n");
                            }
                        }else{
                            builder.append(line.trim()+"\n");
                        }
                    }


                    String hours = format1.format(new Date());
//                    if(Integer.valueOf(hours)>=18)break;
                }

            }
        }catch(Exception e){

        }
    }
}
