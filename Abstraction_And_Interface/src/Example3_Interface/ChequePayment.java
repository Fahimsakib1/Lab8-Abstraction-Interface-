package Example3_Interface;

public class ChequePayment implements Payment
{
    
	
	public double payment (double amount)
	{   
		System.out.println(" I want to Pay With Cheque");
		return amount;
		
	}
	
}
