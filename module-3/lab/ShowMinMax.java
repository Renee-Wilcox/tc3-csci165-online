import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.util.Random;
import java.lang.Math;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
class Drawer extends JPanel {

    private static final long serialVersionUID = 1L;
    private JFrame window = new JFrame();

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

        Graphics2D g2d = (Graphics2D) g;

        //<====> ADD YOUR DRAWING CODE HERE <==========>//
        
        int x,y;

        for (int horizontal = 0; horizontal < 8; horizontal++)
        {
            for (int vertical = 0; vertical < 8; vertical++)
            {
                x = vertical * 10;
                y = horizontal * 10;

                    g.setColor(Color.GREY);
                    g.fillRect(x,y,10,10); //Let's draw!

                    //We need to color GREEN for minimum, RED for maximum 

		            for(int i=1;i<matrix.length;i++){
			        if(matrix[i] > maxValue){
				    maxValue = matrix[i];
                    g.setColor(Color.RED)
                    }//end if

                    if(matrix[i] > minValue){
                        minValue = matrix[i];
                        g.setColor(Color.GREEN);
                    }
			}
		}
		return maxValue;
            }//end nested for loop
        } //end outer for loop

       
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
