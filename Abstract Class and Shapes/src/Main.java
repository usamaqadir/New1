
public class Main {

	public static void main(String[] args) {
		
		Rectangle objrect = new Rectangle (10,20);
		Square objsquare = new Square (5);
		Circle objcircle = new Circle (4);
		
		System.out.println(objrect.shapeName+" "+objrect.area()+" "+objrect.perimeter()+" "+objrect.colour());
		System.out.println(objsquare.shapeName+" "+objsquare.area()+" "+objsquare.perimeter()+" "+objsquare.colour());
		System.out.println(objcircle.shapeName+" "+objcircle.area()+" "+objcircle.perimeter()+" "+objcircle.colour());
		
	}

}
