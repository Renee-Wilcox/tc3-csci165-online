import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.util.Random;
import java.lang.Math;
import java.awt.*;
import java.applet.*;

class ChessBoard extends JPanel {

    private static final long serialVersionUID = 1L;
    private JFrame window = new JFrame();
    
    public ChessBoard() {
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

        /* Now, we will draw a chessboard. */

        Graphics2D g2d = (Graphics2D) g;
        int x,y;

        for (int horizontal = 0; horizontal < 8; horizontal++)
        {
            for (int vertical = 0; vertical < 8; vertical++)
            {
                x = vertical * 20;
                y = horizontal * 20;

                if ( (horizontal % 2) == (vertical % 2) )
                {
                    g.setColor(Color.RED);
                }
                else 
                {
                    g.setColor(Color.BLACK);
                } //end if
                    g.fillRect(x,y,20,20); //Let's draw!

            }//end nested for loop
        } //end outer for loop

    } //end draw chessboard function
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() { 
                ChessBoard ex = new ChessBoard();
                ex.setVisible(true);
            }
        });
    } // end main
} // end class
