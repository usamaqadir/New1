
public class Rectangle extends Shape {

	public int length, width;
	public Rectangle (int len, int wid)
	{
		super ("Rectangle");
		length=len;
		width=wid;
	}
	public Rectangle (String name)
	{
		super (name);
	}
	public double area ()
	{
		return length*width;
	}
	public double perimeter ()
	{
		return 2.0*(length+width);
	}
	public String colour ()
	{
		return "Blue";
	}
}
