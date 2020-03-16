package Example3_Interface;

public class CardPayment implements Payment 
{
     
	public double payment (double amount)
	{   
		
		System.out.println(" I want to Pay With Card");
		return amount;
		
	}
}
