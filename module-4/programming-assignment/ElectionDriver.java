import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;


public class ElectionDriver {

	final String file = "2016_US_County_Level_Presidential_Results.csv";
	
        
	public void fillList()
    {
		ElectionResults2016[] votes = new ElectionResults2016[3142];
		ArrayList<ElectionResults2016> results = new ArrayList<ElectionResults2016>();
		
		try
		{
        
        File csv = new File(file);
        Scanner scanCSV = new Scanner(csv);
        
        while (scanCSV.hasNext())
        {
            String line = scanCSV.nextLine();
           	results.add(line);
            String[] values = line.split(",");
            
            //data parsing
            double demVotes = Double.parseDouble(values[1]);
            double gopVotes = Double.parseDouble(values[2]);
            double totalVotes = Double.parseDouble(values[3]);
            double percentDem = Double.parseDouble(values[4]);
            double percentGOP = Double.parseDouble(values[5]);
         
            ElectionResults2016(demVotes, gopVotes, totalVotes, percentDem, percentGOP)
            {
            	
            }
        }
        
        //close the scanner to prevent resource leaks
        scanCSV.close();
        
        }//end try

        catch(IOException ex)
        {
            System.out.println("There was an error reading the file.");
        }

    }//end fillList

    public ElectionResults2016 findLargestMargin()
    {
    	ElectionResults2016 largest = votes[0];
		for (int i = 0; i < votes.length; i++) {
			if (votes[i] > largest)
				{
				largest = votes[i];
				}
			}
		return largest;
    	
    }//end findLargestMargin

    public ElectionResults2016 findLargestMargin (String state)
    {

    	ElectionResults2016 largest = votes[0];
    	for (int i = 0; i < votes.length; i++) {
			
    		 ArrayList<Object> filteredList = new ArrayList<>();
         for (filteredList r: results) {
               if (r.getState().Equals(state)) 
            	   {
            	   filteredList.add(r);
            	   }
    		
				}
        
			}
    	
    	return largest;
    	
    }//end findLargestMargin 2


    public String[] getStateTotals()
    {
    	String currentState;
    	for (int i = 0; i < votes.length; i++)
    	{
    		
    	}
    	
    	if (demVotes > gopVotes)
    	{
    		demVotes++;
    	}
    	else
    	{
    		gopVotes++;
    	}
    	
    	demVotes + gopVotes = totalVotes;
    	
    	
    }//end getStateTotals
    
    public static main void(String[] args)
    {
    	
    	//function calls
    	fillList();
    	findLargestMargin();
    	findLargestMargin(state);
    	getStateTotals();
    	
    }
}
