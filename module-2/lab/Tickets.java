import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException; 
public class Tickets{

    public static void main(String[] args){

        String  ticket  = "123454";                            
        String  last = ticket.substring(ticket.length() - 1);                                                   
        int     last_digit = Integer.valueOf(last);
        String  reduced_ticket = ticket.substring(0, ticket.length() - 1);
        int     ticket_number = Integer.valueOf(reduced_ticket);
        int     remainder = ticket_number % 7; 
        boolean validity = remainder == last_digit; 
        String  format = "Original Ticket #: %s\nLast Digit: %d\nReduced Ticket #: %d\nRemainder: %d\nValidity: %b\n";
        System.out.printf(format, ticket, last_digit, ticket_number, remainder, validity);  

         try{
             //read the file
            File tickets = new File("tickets.txt");
            //create a scanner to connect to the file
            Scanner ticketsData = new Scanner(tickets);
        
            int linenum = 1;
            //control the loop
            while(ticketsData.hasNextLine()){
                //reads one line of data
                String ticketData = ticketsData.nextLine();
                linenum++;

                if (validity == true)
                {
                    //create the new file to write to
                    try{
                    FileWriter writeValid = new FileWriter("valid_tix.txt");
                    writeValid.write(ticketData);
                    writeValid.close();
                    } //end try
                    
                    catch(IOException ex)
                    {
                        System.out.println("Unable to create file.");
                    }

                } else {
                    //if not valid, move to next ticket number
                    ticketsData.nextLine();
                }
                
            } 
            // close the scanner!!
            ticketsData.close();
        } //end try

        catch(IOException ex){
            System.out.println("File not found!");
        } // end catch  
    }
}