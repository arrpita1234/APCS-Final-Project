import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TamagotchiFrame extends JFrame {
    private Container pane;

    //private JFrame frame;
    private JPanel screen;
    private JButton button1; //Left button
    private JButton button2; //Center button
    private JButton button3; //Right button

    //Constructor
    public TamagotchiFrame() {
	this.setTitle("Tamagotchi - Your Very Own Pet!");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());
	
	//frame.setUndecorated(true);
	//frame.setShape(new RoundRectangle2D.Double(10, 10, 100, 100, 50, 50));
	//frame.setSize(300,200);
	//frame.setVisible(true);

	screen = new JPanel(new BorderLayout()); //Need to put a blank screen up

	button1 = new JButton(); //need to know how to locate it properly
	button2 = new JButton();
	button3 = new JButton();
	pane.add(button1);
	pane.add(button2);
	pane.add(button3);
	pane.add(screen);
	//pane.add(frame);
    }

    public static void main(String[]args) {
	TamagotchiFrame Tamagotchi = new TamagotchiFrame();
	Tamagotchi.setVisible(true);
    }
}
