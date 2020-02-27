import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.util.Random;

class ChessBoard extends JPanel {

    private static final long serialVersionUID = 1L;
    private static final int width = 700;
    private static final int height = 700;
    private JFrame window = new JFrame();
    
    public ChessBoard() {
        initUI();
    }

    private void initUI() {
        window.add(this);
        window.setTitle("2D Drawing");
        window.setSize(width + 16, height + 39);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }

	// add your own drawing instructions in this method
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
        int x = 0, y = 0, squareCount = 0;
        for (int i = 0; i < 7; i++) {
        	for (int j = 0; j < 7; j++) {
        		if (squareCount++ % 2 == 0) g2d.setColor(Color.RED);
        		else g2d.setColor(Color.BLUE);
        		g2d.fillRect(x, y, width/7, height/7);
        		x += width/7;
        	}
        	x = 0;
        	y += height/7;
        }

       
    }
    
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