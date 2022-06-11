import java.util.*;
import java.lang.*;
import java.util.Scanner;
class Assignment8_1{
	public static void main(String[] args){
		double no1,no2;
		Scanner  in = new Scanner(System.in);
		System.out.print("Enter the value of n1: ");
		no1=in.nextInt();
		no2 =0;
		while(no2 == 0){   
	        System.out.print("Enter the value of n2: ");
		    no2=in.nextInt();
			try{
				if(no2 == 0){
					throw new ArithmeticException("Division by zero is not possible ");
				}
			}
			catch(ArithmeticException e){
				System.out.println(e.getMessage());
			}
		}
	    System.out.println("Division of n1 by n2 is: "+(no1/no2));
	}	
}