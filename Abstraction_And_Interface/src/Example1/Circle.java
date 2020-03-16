package Example1;

public class Circle  extends Shape

{
     
	private double radius;

	public Circle(String color, double radius)
	{
		super(color);
		this.radius = radius;
	}
	
	public double area ()
	{
		System.out.println( " Rectangle  Color : " + color);
		return 3.1416 * radius * radius ;
	}

	
	
	
}
