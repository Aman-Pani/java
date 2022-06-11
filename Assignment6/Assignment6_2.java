import java.lang.*;
import java.util.Scanner;

interface Calculator{
	public double add();
	public double sub();
	public double mul();
	public double div();
}
class DemoCalculator implements Calculator{
	double x,y;
	DemoCalculator(){
	}
	DemoCalculator(double num1,double num2){
		x = num1;
		y = num2;
	}
	public double add(){
		return x+y;
	}
	public double sub(){
		return x-y;
	}
	public double mul(){
		return x*y;
	}
	public double div(){
		return x/y;
	}
}
class Assignment6_2{
	public static void main(String args[]){
		Scanner in =new Scanner(System.in);
		System.out.print("Enter two numbers :: ");
		int a = in.nextInt();
		int b = in.nextInt();
		Calculator cal = new DemoCalculator(a,b);
		System.out.print("\nSummation      = "+cal.add()
						+"\nSubrtraction   = "+cal.sub()
						+"\nMultiplication = "+cal.mul()
						+"\nDivision       = "+cal.div());
	}
}