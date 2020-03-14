
public class ElectionResults2016 {

	//declare private (-) variables
    private double demVotes;
    private double gopVotes;
    private double totalVotes;
    private double percentDem;
    private double percentGOP;
    private String stateAbbreviation; 
    private String county;
    private int fips;
    
    //public getters
    public double getTotalVotes()
    {
    	return totalVotes;
    }

    public double getDemVotes()
    {
    	return demVotes;
    }

    public double getGOPVotes()
    {
    	return gopVotes;
    }

    public double getPercentDifference()
    {
    	if (demVotes > gopVotes)
    	{
    		return ((demVotes - gopVotes) /(double)gopVotes) * 100;
    	}
    	
    	else 
    	{
    		return ((gopVotes - demVotes) /(double)demVotes) * 100;
    	}
    	
    }

    public String getState()
    {
    	return stateAbbreviation;
    }

    public String getCounty()
    {
    	return county;
    }

    //define an overloaded constructor 
    public ElectionResults2016(double demV, double gopV, double totalV, double perDem, double perGOP, String state, String county, int fips)
    {
    	this.demVotes = demV;
        this.gopVotes = gopV;
        this.totalVotes = totalV;
        //percent of dem/gop votes
        state = stateAbbreviation;
        this.county = county;
        this.fips = fips;
    }
}
