
public abstract class Shape {
	
	protected String shapeName;
	
    public Shape(String name) 
    {
    	shapeName = name;
    }
    public abstract double area ( );
    public abstract double perimeter ( );
    public abstract String colour ( );
    public String toString( ) 
    {
    	return shapeName;
    }

}
