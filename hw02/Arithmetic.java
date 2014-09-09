//////////////////////////////////////////////////////////////////
//Brian Chen
//hw 2
public class Arithmetic{
//  add main method        
	public static void main(String[] args) { 
          //Number of pairs of socks
		int nSocks = 3;

		//Cost per pair of socks
		//(‘$’ is part of the variable name)
		double sockCost = 2.58;

		//Number of drinking glasses
		int nGlasses = 6;

		//Cost per glass
		double glassCost = 2.29;
		
		//Number of boxes of envelopes
		int nEnvelopes = 1;
//
//
//
///
		//cost per box of envelopes
		double envelopeCost = 3.25;
		double taxPercent = 0.06;

		//total Costs;
		double totalCostSocks = nSocks * sockCost;
		double totalCostGlasses = nGlasses * glassCost;
		double totalCostEnvelopes = nEnvelopes * envelopeCost;
		
		//total before tax
		double totalExTax = totalCostSocks+totalCostGlasses+totalCostEnvelopes;
		
		//total after tax;
		double total = totalExTax * (1+taxPercent);

	}
	
}





