import java.util.*;
import java.lang.*;
import java.util.Scanner;
class Assignment8_2{
	public static void main(String args[]){
		Scanner  in = new Scanner(System.in);
		int arr[]=new int[6];
		int index;
		try{
			System.out.print("Enter the value of index => ");
			index=in.nextInt();
			if(index > (arr.length-1 )){
				throw new ArrayIndexOutOfBoundsException("Index value exceeds array length ");
			}
			else{
				System.out.println("Index value is between array length ");
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
	}
}