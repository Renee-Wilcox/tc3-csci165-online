import java.util.Scanner; //Type "scanner" when you want to ask for user input, it is part of the scanner class

public class Initials{
    public static void main(String[] args){
     Scanner userInput = new Scanner(System.in); //the 'ask for user input' scanner
        String name = "";
        char firstInitial;
        char secondInitial;
        String initials = "";

        System.out.println("Enter your first and last name, please: ");
        name = userInput.nextLine();

        //change to upper
        firstInitial = name.toUpperCase().charAt(0);
        secondInitial = name.toUpperCase().charAt(name.indexOf(" ") + 1);

        initials += firstInitial;
        initials += secondInitial;


        //print out initials
        System.out.println("First initial: " + firstInitial + "  value: " + (int) firstInitial);
        System.out.println("Second initial: " + secondInitial + " value: " + (int)secondInitial);

        //sum
        System.out.print((int)firstInitial + (int)secondInitial);

        //initials as a string...
        System.out.println("Initials: " + initials);

    }
}