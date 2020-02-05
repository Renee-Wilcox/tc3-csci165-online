import java.util.Scanner;

public class GMT{
    public static void main(String[] args){
      Scanner userInput = new Scanner(System.in);

      System.out.println("Enter the GMT (Greenwich Mean Time) offset: ");
        float timeOffset = Float.parseFloat(userInput.nextLine());

      long currentTime = System.currentTimeMillis();

      int hours = (int) (((currentTime / (1000*60*60)) % 24) - timeOffset);
      int min = (int) ((currentTime / (1000*60)) % 60);
      int sec = (int) (currentTime / 1000) % 60;

      System.out.println("Time: " + hours + ":" minutes + ":" seconds);
    }
}