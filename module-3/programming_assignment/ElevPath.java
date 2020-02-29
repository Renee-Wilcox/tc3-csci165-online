import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.util.Random;
import java.lang.Math;
import java.io.File; 
import java.io.IOException; 
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO; 

class ElevPath extends JPanel {

    private static final long serialVersionUID = 1L;
    private JFrame window = new JFrame();
    final static String file = "Colorado_844x480.dat";
    final static int rows = 844;
    final static int cols = 480;

    public ElevPath(String file) {
        initUI(file);
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
    }

        public class MapDataDrawer  {
//a class for maintaining a 2D array of ints representing a topographic map
}

int MapDataDrawer(String filename, int rows, int cols)
{
    try
    {
    File file = new File(filename);
    Scanner input = new Scanner(file);
    data = new int[rows][cols]; //defining the matrix
    
    //nested for loop (2d array) for rows and columns
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < cols; j++)
        {
            data[i][j] = input.nextInt();
        }
    }//end nested 2d array
    
    //PREVENT RESOURCE LEAK!!!
    file.close();
    input.close();

    }//end try

    catch(IoException ex)
    {
        System.out.println("Oops, data file not found.");
    }//end catch

        System.out.println(data); //show the map onscreen

}  //read data from given file into a 2D array

int findMin(int[][] data)  {

        int minVal = Integer.MAX_VALUE;

    for (int i = 0; i < data.length; i++)
    {
        for (int j = 0; j < data[i].length; j++)
        {
            if (data[i][j] < minVal)
            {
                minVal = data[i][j];
            }
        }
}

//return the minimum value in the map
        return minVal;
}


int findMax(int[][] data)  {

    int maxVal = Integer.MIN_VALUE;

    for (int i = 0; i < data.length; i++)
    {
        for (int j = 0; j < data[i].length; j++)
        {
            if (data[i][j] > maxVal)
            {
                maxVal = data[i][j];
            }
        }
}

//return the minimum value in the map
        return maxVal;
}

void drawMap(Graphics g)   {

    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < column; j++)
        {
            //calculation of graphics context using rgb values
            //get pixel value    
            int p = img.getRGB(0,0);    
            //get alpha    
            int a = (p>>24) & 0xff;    
            //get red    
            int r = (p>>16) & 0xff;   
            //get green    
            int g = (p>>8) & 0xff;    
            //get blue    
            int b = p & 0xff;

            int sum = r + g + b; 

            int c = sum / 3 ;
            g.SetColor(new Color(c,c,c));
            g.fillRect(x,y,1,1); 
        }
    }
   

} 
//draw this map in grey scale using given graphics context

int indexOfMinRow(int col)  {
    
        for (int i = 0; i  < data.length; j++)
        {
            if (data[i][col] < minVal)
            {
                int min = i;
                minVal = data[i][col];
            }
        }

            return min;
}
        //given a column, find the index of the row with min elevation  // return row number of 

int drawLowestElevPath(Graphics g, int row) {

    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < column; j++)
        {
            
            
        }
    }

} //draw the lowest elevation path starting from the given row  // return total elev change from the path


int indexOfLowestElevPath(Graphics g)  {

    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < column; j++)
        {
            
            
        }
    }
//find the lowest elev change path in the map  //return the row it starts on
    } //end all of elevpath
    
    public static void main(String[] args) {

        String file = args[0];

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() { 
                ElevPath ev = new ElevPath();
                ex.setVisible(true);
            }
        });
    } // end main
} // end class
