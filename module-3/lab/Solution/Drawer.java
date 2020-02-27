import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;


import java.awt.Color;
import java.util.Random;

class Drawer extends JPanel {

    private static final long serialVersionUID = 1L;
    private JFrame window = new JFrame();
    private Random rand = new Random();
    public Drawer() {
        initUI();
    }

    private void initUI() {
        window.add(this);
        window.setTitle("2D Drawing");
        window.setSize(500, 500);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }

	// add your own drawing intructions in this method
    private void doDrawing(Graphics g) {

        /*
            RGB Colors:
            ================================================
            Black       => (0, 0, 0)        => low elevation
            Mid Grey    => (128, 128, 128)  => mid elevation
            White       => (255, 255, 255)  => high elevation

            Grey Scale colors are scaled in matching set of 3 numeric values
        */

        Graphics2D g2d = (Graphics2D) g;

        //<====> ADD YOUR DRAWING CODE HERE <==========>//
        
        int x = 5, y = 10;
        for (int i = 0; i < 32; i++) {
        	for(int j = 0; j < 30; j++) {
        		g2d.setColor(new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
        		if (i < 12 || j > 14 || j < 14 || i > 18) { // Silly way of not printing where the string is.
        			// This is for a repeating pattern.
        			if (i % 3 == 0) g2d.drawRect(x, y, 10, 10);
        			else if (i % 3 == 1) g2d.fillRect(x, y, 10, 10);
        			else if (i % 3 == 2) g2d.drawOval(x, y, 10, 10);
        			}
        		y += 15;
        	}
        	x += 15;
        	y = 10;
        }
        
        int width = getWidth(), height = getHeight();
        g2d.setColor(Color.RED);
        g2d.drawString("It's me, a String.", width/2 - 50, height/2);
        
        for(int i = 0; i < 2000; i++) {
        	// I won't be held back in my color choices!
        	g2d.setColor(new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
        	x = Math.abs(rand.nextInt() % width);
        	y = Math.abs(rand.nextInt() % height);
        	if ((x < 180 || y > 300 || y < 200) || (x > 300)) { 
        		g2d.drawLine(x, y, x + 2, y + 2);
        	}
        }
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() { 
                Drawer ex = new Drawer();
                ex.setVisible(true);
            }
        });
    } // end main
} // end class
