
public class Circle extends Shape{

	private double radius;
	
	public Circle (double rad)
	{
		super ("Circle");
		radius=rad;
	}
		
		public double area ()
		{
			return Math.PI*radius*radius;
		}
		public double perimeter ()
		{
			return 2*Math.PI*radius;
		}
		public String colour ()
		{
			return "Green";
		}
		
	
}
