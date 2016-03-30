/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3_10533515;

/**
 *
 * @author NANA
 * //1.The windows that appear is 800 pixels wide and 600 pixels tall
 * /*2.The first number of g.drawRect(50, 20, 100, 200) is left-right position you want to place the figure.
     The second number is downward/upward position you want to place the figure
     The third is the length of the figure
       The forth is the width*\
 * //3. Also for the call to fillOval(50, 50 700, 200). First number-  shift right/left position of the oval figure. second number- shift up/down, third number-increase/decrease diameter lengthwise, forth number-widthwise
 * //4.Call to draw string- first number- move left/right, second number- move up/down
 * //5 When two objects overlap the colored object is drawn on top
 * //6.
 */import java.awt.*;
import javax.swing.JFrame;

public class GraphicsDemo1 extends Canvas
{
	public void paint( Graphics g )
	{
		g.setColor(Color.green);
		g.drawRect(50,20,100,200);  // draw a rectangle
		g.fillOval(160,20,100,200); // draw a filled-in oval
		g.setColor(Color.blue);
		g.fillRect(200,400,200,20); // a filled-in rectangle
		g.drawOval(200,430,200,100);
                g.setColor(Color.red);
                g.fillRect(700, 500, 50, 50);
		
		g.setColor(Color.black);
		g.drawString("Graphics are pretty neat.", 500, 500);
		int x = getWidth() / 2;
		int y = getHeight() / 2;
		g.drawString("The first letter of this string is at (" + x + "," + y + ")", x, y);
	}

	public static void main( String[] args )
	{
		// You can change the title or size here if you want.
		JFrame win = new JFrame("GraphicsDemo1");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GraphicsDemo1 canvas = new GraphicsDemo1();
		win.add( canvas );
		win.setVisible(true);
	}
}
