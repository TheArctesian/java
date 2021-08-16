package Games;
import java.awt.Canvas;
import javax.swing.JFrame;

class Minecraft extends Canvas {
    public static int height = 400; 
    public static int width = 600;
    public static void main(String args[]) {
        Minecraft game = new Minecraft();
        JFrame frame = new JFrame();
        frame.setSize(width, height);
        frame.setTitle("Minecraft");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(game);
    }
}   