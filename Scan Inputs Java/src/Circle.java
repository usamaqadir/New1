
public class Circle extends Shape{
	
	int radius;
	public Circle (int rad, String ShapeName)
	{
		super(ShapeName);
		this.radius=rad;
	}
	
	public double area ()
	{
		return 3.142*radius*radius;
	}
	

}
