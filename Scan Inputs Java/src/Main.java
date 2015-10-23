import java.util.Scanner;

public class Main {
	public static void main (String[] args){
		
		
		int wid, len, rad ,side;
		
		Scanner scn = new Scanner(System.in);
		
		
		//Shape objShape = new Shape("NOSHAPE");
		//System.out.println(objShape.ShapeNAme);

		
		System.out.println("Enter Width For Rect"); 
		wid = scn.nextInt();                            // Taking values from the user
		System.out.println("Enter Length For Rect");
		len = scn.nextInt();
		Rectangle objRectangle = new Rectangle(wid, len, "RECTANGLE");		// Object of rectangle class
		//System.out.println(objRectangle.ShapeNAme);
		
		
		System.out.println("Enter Side For Sqaure");
		wid = scn.nextInt();
		Square objSquare = new Square(wid,"Square");		
		//System.out.println(objSquare.ShapeNAme);

		
		
		System.out.println("Enter Radius For Circle");
		rad = scn.nextInt();
		Circle objCircle = new Circle (rad,"Circle");
		//System.out.println(objCircle.ShapeNAme);
		
		
		System.out.println(objRectangle.ShapeNAme+"   "+objRectangle.area());
		System.out.println(objSquare.ShapeNAme+"   "+objSquare.area());
		System.out.println(objCircle.ShapeNAme+"   "+objCircle.area());
		
		
	}

}
