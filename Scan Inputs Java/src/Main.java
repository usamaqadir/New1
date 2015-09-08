import java.util.Scanner;

public class Main {
	public static void main (String[] args){
		
		
		int wid, len, rad ,sid;
		
		Scanner scn = new Scanner(System.in);
		
		
		//Shape objShape = new Shape("NOSHAPE");
		//System.out.println(objShape.ShapeNAme);

		
		System.out.println("Enter Width For Rect"); 
		wid = scn.nextInt();                            // Taking values from the user
		System.out.println("Enter Length For Rect");
		len = scn.nextInt();
		Rectangle objRectangle = new Rectangle(wid, len, "RECTANGLE");		// Object of rectangle class
		System.out.println(objRectangle.ShapeNAme);
		
		
		System.out.println("Enter Side For Sqaure");
		wid = scn.nextInt();
		Square objsquare = new Square(wid,"Square");		
		System.out.println(objsquare.ShapeNAme);

		
		
		System.out.println("Enter Radius For Circle");
		rad = scn.nextInt();
		Circle objCircle = new Circle (rad,"Circle");
		System.out.println(objCircle.ShapeNAme);
		
		
		System.out.println(objRectangle.ShapeNAme+" "+objRectangle.area());
		System.out.println(objsquare.ShapeNAme+" "+objsquare.area());
		System.out.println(objCircle.ShapeNAme+" "+objCircle.area());
		
		
	}

}
