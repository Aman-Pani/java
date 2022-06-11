import java.lang.*;
import java.util.Scanner;

abstract class GeometricFigure{
	double dim1,dim2;
	GeometricFigure(){
	}
	abstract double getArea();
}
class Rectangle extends GeometricFigure{
	Rectangle(){
		super();
	}
	Rectangle(double dim1,double dim2){
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	double getArea() {
		return dim1*dim2;
	}
}
class Triangle extends GeometricFigure{
	Triangle(){
		super();
	}
	Triangle(double dim1,double dim2){
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	double getArea(){
		return 0.5*dim1*dim2;
	}
}
class Assignment6_1{
	public static void main(String args[]){
		Scanner in =new Scanner(System.in);

		System.out.print("Enter two sides :: ");
		int a = in.nextInt();
		int b = in.nextInt();
		GeometricFigure S = new Rectangle(a,b);

		System.out.print("Enter height & base :: ");
		int c = in.nextInt();
		int d = in.nextInt();
		GeometricFigure T = new Triangle(c,d);

		System.out.println("\nArea of Rectangle = "+S.getArea()
		                  +"\nArea of Triangle  = "+T.getArea());	
	}
}