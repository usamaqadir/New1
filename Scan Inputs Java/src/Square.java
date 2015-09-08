
public class Square extends Rectangle{
	
	int side;
	
	public Square(int side, String ShapeName)
	{
		super(side, side, "Square");
		this.side= side;
	}
	public int area()
	{
		return side*side;
	}
	
	

}
