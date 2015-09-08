
public class Rectangle extends Shape {
	int length;
	int width;
	
	
	public Rectangle (int len, int wid, String ShapeName)
	{
		super(ShapeName);
		length=len;
		width=wid;
	}
	
	public int area()
	{
		return length*width;
	}
	
	

}
