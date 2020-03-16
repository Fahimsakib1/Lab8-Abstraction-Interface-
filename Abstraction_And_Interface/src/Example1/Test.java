package Example1;

public class Test {

	public static void main(String[] args) 
	
	{
		Shape T = new Triangle (" Red " , 20.5, 5.65);
		System.out.println(" Area of triangle is : " + T.area());
		System.out.println();
		
		
		Shape R = new Rectangle (" Black " , 1.5, 8.65);
		System.out.println(" Area of Rectangle is : " + R.area());
		System.out.println();
		
		
		Shape C = new Circle (" Green " , 2.54);
		System.out.println(" Area of Circle is : " + C.area());
		System.out.println();
		
		
		
		
		

	}

}