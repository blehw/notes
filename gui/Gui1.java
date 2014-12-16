import javax.swing.*;
import java.awt.*;

public class Gui1 extends JFrame {

    public Gui1(){

	setTitle("My First Gui");
	setSize(600,400);
	setLocation(100,100);
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = getContentPane();
	b1 = new JButton("button");
	pane.add(b1);
    }
    public static void main(String[] args) {
	Gui1 f = new Gui1();
	f.setVisible(true);
    }
}
