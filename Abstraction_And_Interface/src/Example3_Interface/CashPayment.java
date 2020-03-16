package Example3_Interface;

public class CashPayment implements Payment
{
    
	
	public double payment (double amount)
	
	{    
		
		System.out.println(" I want to Pay With Cash");
		return amount;
		
	}
	
}
