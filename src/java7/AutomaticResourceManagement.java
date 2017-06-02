package java7;

/**
 * Created by ahoy on 29/5/17.
 */
public class AutomaticResourceManagement {
    public static void main(String args[]) throws Exception {
        String prefix = "SB011111111";
        String sku = null;

        int skuLength = 11;

        int i = skuLength > prefix.length() ? skuLength - prefix.length() : 1;
        System.out.println(i);
//        System.out.println(String.format("%0"+  i+"d", 1));
        sku = prefix + "-" + String.format("%0" + i + "d", 100);


        System.out.println(sku);

//        Prior Java 7
//        FileInputStream fin = null;
//        BufferedReader br = null;
//        try {
//            fin = new FileInputStream("info.xml");
//            br = new BufferedReader(new InputStreamReader(fin));
//            if (br.ready()) {
//                String line1 = br.readLine();
//                System.out.println(line1);
//            }
//        } catch (FileNotFoundException ex) {
//            System.out.println("Info.xml is not found");
//        } catch (IOException ex) {
//            System.out.println("Can't read the file");
//        } finally {
//            try {
//                if (fin != null)
//                    fin.close();
//                if (br != null)
//                    br.close();
//            } catch (IOException ie) {
//                System.out.println("Failed to close files");
//            }
//        }

//        try (FileInputStream fin = new FileInputStream("info.xml");
//             BufferedReader br = new BufferedReader(new InputStreamReader(fin));) {
//            if (br.ready()) {
//                String line1 = br.readLine();
//                System.out.println(line1);
//            }
//        }


    }
}
