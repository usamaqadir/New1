
public class Square extends Rectangle {

	int side;
	
	public Square (int sid,String name)
	{
		super(sid, sid, name);
		side=sid;
	}
	
	public int area()
	{
		return side*side;
	}
}
