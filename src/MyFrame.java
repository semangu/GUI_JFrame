import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	MyFrame(){
		this.setSize(420, 420); //   set the x-dimension and y-dimension of this
		this.setTitle("JFrame title goes here"); // sets title of this
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
	//	this.setResizable(false); // prevent this from being resized
		this.setVisible(true); // make frame visible
		ImageIcon image= new ImageIcon("saturn.png"); // create an ImageIcon
		this.setIconImage(image.getImage()); // change icon of this
		this.getContentPane().setBackground(new Color(140,5,78)); // change color of background
		// 255 is the max random value you can enter
	}
}
