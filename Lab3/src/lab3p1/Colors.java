package lab3p1;
//*************************************************************
//Colors.java
//
//Draw rectangles to illustrate colors and their codes in Java
//*************************************************************
import javax.swing.JApplet;
import java.awt.*;
    public class Colors extends JApplet
    {
        public void paint (Graphics page)
        {
            // Declare size constants
            final int PAGE_WIDTH = 600;
            final int PAGE_HEIGHT = 400;
            
            // Declare variables
            int x, y; // x and y coordinates of upper left-corner of each shape
            int width, height; // width and height of each shape
            Color myColor = new Color (2486921);
            int redCode, greenCode, blueCode;
            
            // Set the background color and paint the screen with a white rectangle
            setBackground (Color.white);
            page.setColor(Color.white);
            page.fillRect(0, 0, PAGE_WIDTH, PAGE_HEIGHT);
            
            // Set the color for the rectangle
            page.setColor (myColor);
            
            redCode = myColor.getRed();
            greenCode = myColor.getGreen();
            blueCode = myColor.getBlue();
            
            // Assign the corner point and width and height then draw
            x = 200;
            y = 125;
            width = 200;
            height = 150;
            page.fillRect(x, y, width, height);
            
            page.setColor (Color.black);
            page.drawString("Red: " + redCode, 200, 150 );
            page.drawString("Green: " + greenCode, 200, 175 );
            page.drawString("Blue: " + blueCode, 200, 200 );
        }
    }