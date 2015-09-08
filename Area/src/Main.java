import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int len,wid,sid,rad;
		Scanner scn = new Scanner (System.in);
		
			
		System.out.println("Enter Length for Rectangle");
		len=scn.nextInt();
		System.out.println("Enter Width for Rectangle");
		wid=scn.nextInt();
		System.out.println("Enter Side for Square");
		sid=scn.nextInt();
		System.out.println("Enter Radius for Circle");
		rad=scn.nextInt();
		
		//Shape objshape = new Shape("");
		Rectangle objrectangle = new Rectangle(len,wid,"Rectangle");
		Square objsquare = new Square(sid,"Square");
		Circle objcircle = new Circle(rad,"Circle");
		
		
		
		System.out.println(objrectangle.name+" "+objrectangle.area());
		System.out.println(objsquare.name+" "+objsquare.area());
		System.out.println(objcircle.name+" "+objcircle.area());
		
	}

}