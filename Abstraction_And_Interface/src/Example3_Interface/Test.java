package Example3_Interface;

public class Test {

	public static void main(String[] args) 
	{
	      Payment P1 = new CashPayment ();
	      System.out.println(" Cash Payment is : " + P1.payment(30000.00) + " Taka " );
	      System.out.println();
	      
	      Payment P2 = new CardPayment ();
	      System.out.println(" Card Payment is : " + P2.payment(32000.00) + " Taka With 2% Bank Charge " );
	      System.out.println();
	      
	      Payment P3 = new ChequePayment ();
	      System.out.println(" Cheque Payment is : " + P3.payment(35000.00) + " Taka " );
	      System.out.println();
	      
	      
	 }

}
