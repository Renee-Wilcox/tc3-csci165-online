// CSCI2
// 02/18/2020
// Displays the minimum and maximum values of a grids rows.

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.FileNotFoundException;

import javax.swing.JFrame;
import javax.swing.JPanel;


import java.awt.Color;
import java.util.Random;

class ShowMinMax extends JPanel {

    private static final long serialVersionUID = 1L;
    private JFrame window = new JFrame();
    private Random rand = new Random();
    public ShowMinMax() {
        initUI();
    }

    private void initUI() {
        window.add(this);
        window.setTitle("Show Min-Max");
        window.setSize(350, 800);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
			doDrawing(g);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }

	// add your own drawing intructions in this method
    private void doDrawing(Graphics g) throws FileNotFoundException {

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
        int[][] matrix = new int[50][20];
        MatrixStuff.fillArrayColumnMajor(matrix);
        int x = 25, y = 5;
        for (int i = 0; i < matrix.length; i++) {
        	// Stores minimum and maximum values in order to color the grid appropriately
        	int max = MatrixStuff.findMaxOfRow(matrix, i);
        	int min = MatrixStuff.findMinOfRow(matrix, i);
        	
        	// Displays row number next to row.
        	g2d.setColor(Color.BLACK);
        	g2d.drawString(String.valueOf(i), 5, y + 10);
        	for(int j = 0; j < matrix[0].length; j++) {
        		
        		// Sets color if the current value is the min or the max
        		// Keep in mind this can happen more than once in a row with duplicate max/min values
        		if (matrix[i][j] == max) g2d.setColor(Color.RED);
        		else if (matrix[i][j] == min) g2d.setColor(Color.GREEN);
        		else g2d.setColor(new Color(128,128,128));
        		g2d.fillRect(x, y, 10, 10);
        		x += 15;
        	}
        	// Reset x-pos
        	x = 25;
        	y += 15;
        }
        
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() { 
                ShowMinMax ex = new ShowMinMax();
                ex.setVisible(true);
            }
        });
    } // end main
} // end class
