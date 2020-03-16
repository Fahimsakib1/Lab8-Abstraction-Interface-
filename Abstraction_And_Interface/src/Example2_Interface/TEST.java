package Example2_Interface;

public class TEST 
{

	public static void main(String[] args) 
	{
		BANK H = new HSBC ();
	    System.out.println(" HSBC BANK Interest Rate  " + H.InterestRate() + " Percent");
	    System.out.println(" Pay Interest Of " + H.PayInterest() + " Taka ");
	    
	    System.out.println();
	    
	    BANK B = new BRAC ();
	    System.out.println(" BRAC BANK Interest Rate  " + B.InterestRate() + " Percent");
	    System.out.println(" Pay Interest Of " + B.PayInterest() + " Taka ");
	    
	    
	    
	    

	}

}
