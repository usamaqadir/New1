
public class Rectangle extends Shape {
	
	int length,width;

	public Rectangle ( int len, int wid, String name)
	{
		super (name);
		length=len;
		width=wid;
	}
	public int area()
	{
		return length*width;
	}
}
