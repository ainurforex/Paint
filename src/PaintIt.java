
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.colorchooser.*;
import javax.swing.event.*;


public class PaintIt extends JFrame {

     JPanel canvas = new JPanel();

    public PaintIt () {


        setLocation(100, 100);
        setSize(900, 700);
        setTitle("Panel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvas.setBackground(Color.WHITE);
    }


    public static void main (String [] args) {
        PaintIt p = new PaintIt();
        p.setVisible(true);
    }
}