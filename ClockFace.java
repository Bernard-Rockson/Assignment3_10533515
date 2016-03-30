/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3_10533515;

/**
 *
 * @author NANA
 */
 import java.awt.*;
import javax.swing.JFrame;

public class ClockFace extends Canvas
{
	public void paint( Graphics g )
	{
          g.drawOval(200,150,310,300);
          g.setColor(Color.black);
          g.fillOval(345, 295, 10, 10);
          g.drawLine(350, 300, 230, 300);
          g.drawLine(350, 300, 350, 360);
            
        }

public static void main( String[] args )
	{
		// You can change the title or size here if you want.
		JFrame win = new JFrame("ClockFace");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ClockFace canvas = new ClockFace();
		win.add( canvas );
		win.setVisible(true);
	}
}
