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


public class SmilingFace extends Canvas
{
    public void paint (Graphics g)
    {
     g.setColor(Color.YELLOW);
     g.fillOval(300, 100 ,200, 200);
     g.setColor(Color.BLUE);
     g.fillOval(350, 160, 35, 35);
     g.setColor(Color.BLUE);
     g.fillOval(415, 160, 35, 35);
     g.setColor(Color.RED);
     g.drawArc(350,110,100,150,230,80); 
     
        
       // labels
g.setColor(Color.black);
g.setFont(new Font(null));
for ( int X=0; X<800; X += 50 )
    g.drawString( String.valueOf(X), X, 50 );
for ( int Y=100; Y<600; Y += 50 )
    g.drawString( String.valueOf(Y), 28, Y );
// lines
g.setColor(Color.lightGray);
for ( int X=0; X<800; X += 50 )
    g.drawLine(X,0,X,599);    // horizontal
for ( int Y=0; Y<600; Y += 50 )
    g.drawLine(0,Y,799,Y);    // vertical

    }

    
public static void main( String[] args )
	{
		javax.swing.JFrame win = new javax.swing.JFrame("SmilingFace: Fonts and Lines");
		win.setSize(800, 600);
		win.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		SmilingFace canvas = new SmilingFace();
		win.add( canvas );
		win.setVisible(true);
	}
}
