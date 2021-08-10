import java.awt.Canvas;
import javax.swing.JFrame;

public class blankFrame extends Canvas {
	public static final int WIDTH = 600;
	public static final int HEIGHT = 600;

	public static void main(String[] args) {
		blankFrame game = new blankFrame();
		JFrame frame = new JFrame();
		frame.add(game);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(WIDTH,HEIGHT);
		frame.setResizable(false);
		frame.setVisible(true);
		System.out.println("blank Frame prini");
	}
}

