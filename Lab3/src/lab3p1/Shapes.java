package lab3p1;
//************************************************************
//Shapes.java
//
//The program will draw two filled rectangles and a
//filled oval.
//************************************************************
import javax.swing.JApplet;
import java.awt.*;

public class Shapes extends JApplet 
{
    public void paint (Graphics page)
    {
     // Declare size constants
        final int MAX_SIZE = 300;
        final int PAGE_WIDTH = 600;
        final int PAGE_HEIGHT = 400;
        
     // Declare variables
        int x, y; // x and y coordinates of upper left-corner of each shape
        int width, height; // width and height of each shape
        
     // Set the background color
        setBackground (Color.yellow);
        // Assign the corner point and width and height
        
        x = 175;
        y = 125;
        width = 200;
        height = 200;
        // Draw the rectangle
        page.setColor (Color.green);
        page.fillOval(x, y, width, height);
       
        x = 200;
        y = 150;
        width = 50;
        height = 50;
        // Draw the rectangle
        page.setColor (Color.blue);
        page.fillOval(x, y, width, height);
        
        x = 0;
        y = 0;
        width = 50;
        height = 50;
        // Draw the rectangle
        page.setColor (Color.red);
        page.fillRect(x, y, width, height);
        
        x = 300;
        y = 300;
        width = 100;
        height = 150;
        // Draw the rectangle
        page.setColor (Color.cyan);
        page.fillRect(x, y, width, height);
    }

}
