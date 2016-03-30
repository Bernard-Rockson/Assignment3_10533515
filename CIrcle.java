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
import java.awt. *;
import javax.swing.JFrame;

public class CIrcle extends Canvas
{
  public void paint( Graphics g ) 
  {
       g.setColor(Color.blue);
      g.fillOval(300, 70, 100, 200);
     
      
  }
 public static void main( String[] args )
    {
        // You can change the title or size here if you want.
        JFrame win = new JFrame("GraphicsCIrcle");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CIrcle canvas = new CIrcle();
        win.add( canvas );
        win.setVisible(true);
    }
}
