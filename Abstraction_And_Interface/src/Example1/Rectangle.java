package Example1;

public class Rectangle extends Shape
{
 
	private double length;
	private double width;
	
	
	public Rectangle(String color, double length, double width) 
	{
		super(color);
		this.length = length;
		this.width = width;
		
	}
	
	  public  double area ()
	  {
		    System.out.println( " Rectangle  Color : " + color);
		    return length*width;
	  }
	
	
}  
