import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class getPixelValue {
    public static void main(String args[])throws IOException
    {
        BufferedImage image = null;
        File file = null;
        //read image
        try
        {
            file = new File("C:/Users/steph/Desktop/Hackerman/java/0.png");
            image = ImageIO.read(file);
            System.out.println("Reading complete.");
        }
        catch(IOException e)
        {
            System.out.println("no work");
        }
        int p = image.getRGB(0,0);
        int a = (p>>24) & 0xff;
        int r = (p>>16) & 0xff;
        int g = (p>>8) & 0xff;
        a = p & 0xff;
        a = 255;
        r = 100;
        g = 150;
        int b = 200;
        //set the pixel value
        p = (a<<24) | (r<<16) | (g<<8) | b;
        image.setRGB(0, 0, p);
        //write image
        try
        {
            file = new File("C:/Users/steph/Desktop/Hackerman/java/0.png");
            ImageIO.write(image, "png", file);
            System.out.println("Writing complete.");
        }
        catch(IOException e)
        {
        System.out.println("not writing image");
        }
    }
}
