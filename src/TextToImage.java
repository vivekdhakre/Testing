import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by rtbkit on 7/4/17.
 */
public class TextToImage {

    public static void main(String[] args) {

        File f = new File("/home/applogs/Shivsa/Images" + File.separator + "3" + File.separator + "3" + File.separator +"1.png");;

        System.out.println(f.getName().substring((f.getName().split("\\.").length-1)+1));

//        String text = "Hello";
//
//        /*
//           Because font metrics is based on a graphics context, we need to create
//           a small, temporary image so we can ascertain the width and height
//           of the final image
//         */
//        BufferedImage img = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
//        Graphics2D g2d = img.createGraphics();
//        Font font = new Font("Arial", Font.PLAIN, 48);
//        g2d.setFont(font);
//        FontMetrics fm = g2d.getFontMetrics();
//        int width = fm.stringWidth(text);
//        int height = fm.getHeight();
//        g2d.dispose();
//
//        img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
//        g2d = img.createGraphics();
//        g2d.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
//        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        g2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
//        g2d.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
//        g2d.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
//        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
//        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
//        g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
//        g2d.setFont(font);
//        fm = g2d.getFontMetrics();
//        g2d.setColor(Color.BLACK);
//        g2d.setBackground(Color.white);
//        g2d.drawString(text, 0, fm.getAscent());
//        g2d.dispose();
//        try {
//            ImageIO.write(img, "jpg", new File("/home/vivek/Text.jpg"));
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }

    }
}
