import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
public class greyscale {
    public static void main(String args[])throws IOException{
        BufferedImage image = null;
        File file = null;
    try
        {
            file = new File("C:/Users/steph/Desktop/Hackerman/java/0.png");
            image = ImageIO.read(file);
        }
    catch(IOException e)
        {System.out.println("no read");}


    int width = image.getWidth();
    int height = image.getHeight();
    for (int y = 0; y < height; y++){
        for (int x = 0; x < width; x++){
            int p = image.getRGB(x,y);
            int a = (p>>24) & 0xff;
            int r = (p>>16) & 0xff;
            int g = (p>>8) & 0xff;
            int b = p & 0xff;
            int avg = (r+g+b)/3;
            p = (a<<24) | (avg<<16) | (avg<<8) | avg;
            image.setRGB(x, y, p);
        }
    }
    try
    {
        file = new File("C:/Users/steph/Desktop/Hackerman/java/0.png");
        ImageIO.write(image, "png", file);
        System.out.println("Successfully converted a colored image into a grayscale image");
    }
    catch(IOException e)
    {
        System.out.println(e);
    }
}

//fuck this 
// this dosnt work 
// guess i just do it in a high level language 
}
