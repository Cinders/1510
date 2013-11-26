package lab3p1;

// *************************************************************
// Coords.java
//
// Draw rectangles to illustrate the Java coordinate system
//
// *************************************************************
import javax.swing.JApplet;
import java.awt.*;

public class Coords extends JApplet
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
        
        // Set the color for the next shape to be drawn
        page.setColor (Color.blue);
        
        // Assign the corner point and width and height
        //Middle
        x = 225;
        y = 150;
        width = 150;
        height = 100;
        page.fillRect(x, y, width, height);
        
        //Top left
        x = 0;
        y = 0;
        width = 225;
        height = 150;
        page.setColor (Color.red);
        page.fillRect(x, y, width, height);
        
        //Top Right
        x = 375;
        y = 0;
        width = 225;
        height = 150;
        page.setColor (Color.green);
        page.fillRect(x, y, width, height);
        
        //Bottom left
        x = 0;
        y = 250;
        width = 225;
        height = 150;
        page.setColor (Color.cyan);
        page.fillRect(x, y, width, height);
        
        //Bottom right
        x = 375;
        y = 250;
        width = 225;
        height = 150;
        page.setColor (Color.pink);
        page.fillRect(x, y, width, height);
    }
}