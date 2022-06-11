import java.util.*;
import java.lang.*;
import java.util.Scanner;
class Assignment8_3{
	public static void main(String args[]){
		double x,y;
		Scanner  in = new Scanner(System.in);
		System.out.print("Enter the value of x=> ");
		x=in.nextInt();
		System.out.print("Enter the value of y=> ");
		y=in.nextInt();
		try{
			if((x-y)== 0){
					throw new ArithmeticException("Plz enter valid input for x & y ");
			}
			else{
				System.out.println("Result of [x/(x-y)] is :: "+(x/(x-y)));
			}
		}
		catch(ArithmeticException e){
			System.out.println("Value of denomenetor cannot be zero..."+ e.getMessage());
		}
	}	
}